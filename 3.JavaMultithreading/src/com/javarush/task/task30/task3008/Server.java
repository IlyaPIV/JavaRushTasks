package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    private static class Handler extends Thread {
        Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Установлено новое соединение с " + socket.getRemoteSocketAddress());

            String userName = null;

            try (Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);

                // Сообщаем всем участникам, что присоединился новый участник
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));

                // Сообщаем новому участнику о существующих участниках
                notifyUsers(connection, userName);

                // Обрабатываем сообщения пользователей
                serverMainLoop(connection, userName);

            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Ошибка при обмене данными с " + socket.getRemoteSocketAddress());
            }

            if (userName != null) {
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            }

            ConsoleHelper.writeMessage("Соединение с " + socket.getRemoteSocketAddress() + " закрыто.");
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            Message answer = null;
            String name = "";
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                answer = connection.receive();

                if (answer.getType().equals(MessageType.USER_NAME)){
                    name = answer.getData();
                    if (name.equals("")) {
                        continue;
                    }
                    if (connectionMap.containsKey(name)) {
                        continue;
                    }

                    connectionMap.put(name, connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED));
                    break;

                }
            }
            return name;
        }

        private void notifyUsers(Connection connection, String username) throws IOException{
            for (Map.Entry<String, Connection> con:
                 connectionMap.entrySet()) {
                if (!con.getKey().equals(username)) {
                    connection.send(new Message(MessageType.USER_ADDED, con.getKey()));
                }
            }
        }

        private void serverMainLoop(Connection connection, String username) throws IOException, ClassNotFoundException {
            while (true) {
                Message inMessage = connection.receive();
                if (inMessage.getType()==MessageType.TEXT) {
                    String txt = username + ": " + inMessage.getData();
                    sendBroadcastMessage(new Message(MessageType.TEXT, txt));
                } else {
                    ConsoleHelper.writeMessage("Получено сообщение от " + socket.getRemoteSocketAddress() + ". Тип сообщения не соответствует протоколу.");
                }
            }
        }

    }

    public static void main(String[] args) {
        ServerSocket serverSocket;

        int port = ConsoleHelper.readInt();
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Server is started");
        try{
            while (true) {
                Socket clientSocket = serverSocket.accept();
                Handler newClientHandler = new Handler(clientSocket);
                newClientHandler.start();
            }
        } catch (Exception e ){
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void sendBroadcastMessage(Message message) {
        // Рассылаем сообщение по всем соединениям
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Не смогли отправить сообщение " + connection.getRemoteSocketAddress());
            }
        }
    }
}

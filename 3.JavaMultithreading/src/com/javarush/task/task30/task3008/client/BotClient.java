package com.javarush.task.task30.task3008.client;

import java.util.Random;

public class BotClient extends Client{

    public class BotSocketThread extends SocketThread {

    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return String.format("date_bot_%d", (int) (Math.random() * 100));
    }

    public static void main(String[] args) {
        BotClient bot = new BotClient();
        bot.run();
    }
}

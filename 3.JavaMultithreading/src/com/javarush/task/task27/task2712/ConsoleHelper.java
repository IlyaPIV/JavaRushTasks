package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException{
            return br.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        writeMessage("Creating new order. Our menu is:");
        writeMessage(Dish.allDishesToString());
        writeMessage("exit - to finish order");
        List<Dish> dishes = new ArrayList<>();

        while (true) {
            String input = readString();
            if (input.equals("exit")) break;
            try {
                Dish dish = Dish.valueOf(input);
                dishes.add(dish);
            } catch (IllegalArgumentException e) {
                writeMessage("no such dish in menu");
            }

        }

        return dishes;
    }
}

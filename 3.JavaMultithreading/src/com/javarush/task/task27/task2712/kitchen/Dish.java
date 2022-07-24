package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    FISH(25),
    STEAK(30),
    SOUP(15),
    JUICE(5),
    WATER(3);

    private int duration;

    Dish(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString(){
        Dish[] dishes = Dish.values();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dishes.length; i++) {
            sb.append(dishes[i]);
            if (i < dishes.length-1) sb.append(",");
        }
        return sb.toString();
    }
}

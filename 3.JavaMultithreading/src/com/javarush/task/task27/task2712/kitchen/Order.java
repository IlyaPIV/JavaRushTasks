package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;


public class Order {

    private final Tablet tablet;
    protected List<Dish> dishes;


    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString() {
        if (dishes.size() == 0) return "";
        StringBuilder order = new StringBuilder("Your order: [");
        for (int i = 0; i < dishes.size(); i++) {
            order.append(dishes.get(i));
            if (i!= dishes.size()-1) order.append(',');
        }
        order.append("] of ").append(tablet.toString());

        order.append(", cooking time ").append(getTotalCookingTime()).append("min");

        return order.toString();
    }

    public boolean isEmpty(){
        return dishes.isEmpty();
    }

    public int getTotalCookingTime(){
        int totalTime = 0;
        for (Dish dish:
             dishes) {
            totalTime += dish.getDuration();
        }
        return totalTime;
    }
}

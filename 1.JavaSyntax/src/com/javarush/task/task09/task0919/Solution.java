package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e){
            System.out.println("Ошибка - деление на 0!");
            e.printStackTrace();
        }
    }

    public static void divideByZero() throws ArithmeticException{

        System.out.printf("%d / %d = %d\n", 17, 0, 17/0);

    }
}

package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.sql.Array;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int summ = 0;
        int ost = 0;
        while (number>0) {
            ost = number%10;
            summ +=ost;
            number = number/10;
        }
        return summ;
    }
}
package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Boolean> order = new ArrayList<>();

        for (String word:
             array) {
            boolean itIsNumber = isNumber(word);
            if (itIsNumber) numbers.add(-Integer.parseInt(word));
                else words.add(word);
            order.add(itIsNumber);
        }
        Collections.sort(numbers);

        for (int j = 0; j < words.size()-1; j++) {  //от 0 до
            for (int i = 0; i < words.size()-1-j; i++) {
                if (isGreaterThan(words.get(i), words.get(i+1))) {
                    String temp = words.get(i);
                    words.set(i, words.get(i+1));
                    words.set(i+1,temp);
                }
            }
        }
        ;

       // Collections.sort(words);

        int pozW = 0;
        int pozN = 0;
        for (int i = 0; i < array.length; i++) {
            boolean itIsNumer = order.get(i);
            if (itIsNumer) {
                array[i] = ""+(-1 * (int) numbers.get(pozN));
                pozN++;
            } else
            {
                array[i] = words.get(pozW);
                pozW++;
            }
        }
//        for (String word:
//             array) {
//            System.out.println(word);
//        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}

package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] massInt = new int[10];
        String[] massString = new String[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            massString[i] = br.readLine();
            massInt[i] = massString[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(massInt[i]);
        }
    }
}

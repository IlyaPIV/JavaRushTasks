package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mass = new int[10];
        for (int i = 0; i < 10; i++) {
            mass[i] = Integer.parseInt(br.readLine());
        }
       // Arrays.sort(mass);
        for (int i = 0; i < 10; i++) {
            System.out.println(mass[9-i]);
        }
    }
}


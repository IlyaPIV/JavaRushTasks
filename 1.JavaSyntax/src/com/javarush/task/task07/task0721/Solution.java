package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] mass = getInts();
        maximum=mass[0];
        minimum=mass[0];
        for (int i = 1; i < 20; i++) {
            if (mass[i]<minimum) minimum=mass[i];
            if (mass[i]>maximum) maximum=mass[i];
        }
        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код

    public static int[] getInts() throws IOException {
        int[] mass = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            mass[i]=Integer.parseInt(br.readLine());
        }
        return mass;
    }
}

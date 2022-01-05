package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] mass = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++) {
            mass[i] = Integer.parseInt(br.readLine());
        }
        int chet = 0;
        int nechet = 0;
        for (int i = 0; i < 15; i++) {
            if (i%2==0) chet +=mass[i];
                else nechet+=mass[i];
        }
        if (chet>nechet) System.out.println("В домах с четными номерами проживает больше жителей.");
            else if (nechet>chet) System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}

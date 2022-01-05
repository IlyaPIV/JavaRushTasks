package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] massBig = new int[20];
        int[] massSmall1 = new int[10];
        int[] massSmall2 = new int[10];
        for (int i = 0; i < 20; i++) {
            massBig[i] = Integer.parseInt(br.readLine());
            if (i<10) massSmall1[i]=massBig[i];
                else massSmall2[i-10]=massBig[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(massSmall2[i]);
        }
    }
}

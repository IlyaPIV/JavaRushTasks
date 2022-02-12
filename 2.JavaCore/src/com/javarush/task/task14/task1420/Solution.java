package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
 //       System.out.println(a);
 //       System.out.println(b);
        int min = min(a,b);
        int currNOD = 0;
        for (int i = 1; i <= min; i++) {
            if (a%i==0 && b%i==0) currNOD = i;
        }
        System.out.println(currNOD);
    }

    public static int min(int a, int b){
        return a<b ? a : b;
    }
}

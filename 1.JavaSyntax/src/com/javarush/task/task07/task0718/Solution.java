package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        int index = 0;
        int maxLength = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            int currentLength = list.get(i).length();
            if (currentLength>maxLength) maxLength = currentLength;
                else {
                index = i;
                break;
            }
        }
        if (index!=0) System.out.println(index);
    }
}


package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        br.close();

        br = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bwr = new BufferedWriter(new FileWriter(fileName2));


        while (br.ready()) {
            String[] words = br.readLine().split(" ");
            for (String word:
                 words) {
                try {
                    Integer value = Integer.parseInt(word);
                    bwr.write(word+" ");

                } catch (NumberFormatException e) {

                }
            }
        }

        br.close();
        bwr.close();
    }
}

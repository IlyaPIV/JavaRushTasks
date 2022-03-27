package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
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
            int value = br.read();
            if (value==46) value=33;
            bwr.write(value);
        }
        br.close();
        bwr.close();
    }
}

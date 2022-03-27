package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        //String file1 = "I:\\Java_projects\\Java Rush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1820\\fileInput.txt";
        String file2 = br.readLine();
        //String file2 = "I:\\Java_projects\\Java Rush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1820\\fileOutput.txt";
        br.close();

        FileInputStream fis = new FileInputStream(file1);
        FileWriter fwr = new FileWriter(file2);

        LinkedList<Integer> list = new LinkedList<>();


        while (fis.available()>0) {
            StringBuilder inputValue = new StringBuilder();
            int value = 0;
            while (fis.available()>0 && (value = fis.read())!=32) {
                inputValue.append((char) value);
            }

            list.add((int) Math.round(Double.parseDouble(inputValue.toString())));
        }

        fis.close();

        for (Integer value:
             list) {
            fwr.write(value.toString());
            fwr.write(" ");
        }
        fwr.close();
    }
}

package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        //String fileName1 = "I:\\Java_projects\\Java Rush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1906\\fileInput.txt";
        String fileName2 = br.readLine();
        //String fileName2 = "I:\\Java_projects\\Java Rush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1906\\fileOutput.txt";
        br.close();

        FileReader fr = new FileReader(fileName1);
        FileWriter fwr = new FileWriter(fileName2);
        int count = 0;
        while (fr.ready()) {
            count++;
            int current = fr.read();
            if (count%2==0) fwr.write(current);
        }

        fr.close();
        fwr.close();
    }
}

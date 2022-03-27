package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length==4 && args[0].equals("-c")) {

            int newID = 0;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            reader.close();
            reader = new BufferedReader(new FileReader(filename));
            while (reader.ready()) {
                String current = reader.readLine();
                int currentID = Integer.parseInt(current.substring(0,8).trim());
                if (currentID>newID) newID = currentID;
            }
            newID++;
            reader.close();
            FileWriter fwr = new FileWriter(filename,true);
            String newString = String.format("%-8d%-30s%-8s%-4s", newID, args[1], args[2], args[3]);

            fwr.write("\n");
            fwr.write(newString);
            fwr.close();

        }
    }
}

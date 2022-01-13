package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        ArrayList<String> words = new ArrayList<>();
        while (true){
            int point = string.indexOf(" ");
            if (point==0) {
                string = string.substring(point+1);
            } else if (point==-1) {
                words.add(string);
                break;
            } else
            {
                words.add(string.substring(0,point));
                string = string.substring(point+1);
            }
        }
        string = "";
        for (String word:
             words) {
            if (!string.equals("")) string+=" ";
            string+=wordsToUpperCase(word);
        }
        System.out.println(string);
    }

    public static String wordsToUpperCase(String word){
        return word.substring(0,1).toUpperCase()+word.substring(1);
    }
}

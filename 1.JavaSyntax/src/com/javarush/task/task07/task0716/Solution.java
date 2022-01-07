package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String currentString = strings.get(i);
            if (currentString.indexOf("р")!=-1 && currentString.indexOf("л")!=-1) list.add(currentString);
                else {
                    if (currentString.indexOf("л")!=-1) {
                        list.add(currentString);
                        list.add(currentString);
                    } else if (currentString.indexOf("р")==-1)
                        list.add(currentString);
            }
        }
        return list;
    }
}
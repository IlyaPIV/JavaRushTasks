package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        ArrayList<Integer> listMod3 = new ArrayList<Integer>();
        ArrayList<Integer> listMod2 = new ArrayList<Integer>();
        ArrayList<Integer> listOther = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            int currentValue = list.get(i);
            if ((currentValue%3==0) || (currentValue%2==0)) {
                if (currentValue%3==0) listMod3.add(currentValue);
                if (currentValue%2==0) listMod2.add(currentValue);
            } else listOther.add(currentValue);
        }
        printList(listMod3);
        printList(listMod2);
        printList(listOther);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

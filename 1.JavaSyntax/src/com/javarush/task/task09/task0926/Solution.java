package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> ourList = new ArrayList<>();
        ourList.add(newArray(5));
        ourList.add(newArray(2));
        ourList.add(newArray(4));
        ourList.add(newArray(7));
        ourList.add(newArray(0));

        return ourList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }

    public static int[] newArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(50);
        }
        return array;
    }
}

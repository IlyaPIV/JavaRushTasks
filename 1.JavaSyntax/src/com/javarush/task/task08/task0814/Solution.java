package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Random rnd = new Random();
        Set<Integer> ourSet = new HashSet<>();
        ourSet.add(10);
        ourSet.add(2);
        ourSet.add(5);
        ourSet.add(6);
        ourSet.add(19);
        ourSet.add(100);
        ourSet.add(11);
        ourSet.add(20);
        ourSet.add(8);
        ourSet.add(12);
        ourSet.add(39);
        ourSet.add(0);
        ourSet.add(15);
        ourSet.add(1);
        ourSet.add(-19);
        ourSet.add(-5);
        ourSet.add(111);
        ourSet.add(200);
        ourSet.add(88);
        ourSet.add(-12);
        return ourSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer current = iterator.next();
            if (current>10) iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {

    }
}

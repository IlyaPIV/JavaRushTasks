package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String,Integer> ourMap = new HashMap<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            ourMap.put("Иванов-"+i,rnd.nextInt(1000));
        }
        return ourMap;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            int salary = pair.getValue();

            if (salary<500) iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
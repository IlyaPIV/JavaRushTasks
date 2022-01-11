package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> ourMap = new HashMap<>();
        ourMap.put("Иванов", "Иван");
        ourMap.put("Петров", "Пётр");
        ourMap.put("Сидоров", "Сидор");
        ourMap.put("Олегов", "Олег");
        ourMap.put("Серегин", "Сергей");
        ourMap.put("Алексеев", "Алексей");
        ourMap.put("Федоров", "Фёдор");
        ourMap.put("Жориков", "Жора");
        ourMap.put("Ильин", "Ильин");
        ourMap.put("Степанов", "Степан");
        return ourMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> currentValue = iterator.next();
            if (currentValue.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> currentValue = iterator.next();
            if (currentValue.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}

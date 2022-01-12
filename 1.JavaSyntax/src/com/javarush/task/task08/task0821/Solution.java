package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> ourMap = new HashMap<>();
        ourMap.put("Иванов", "Иван");
        ourMap.put("Петров", "Олег");
        ourMap.put("Сидоров", "Сидор");
        ourMap.put("Олегов", "Олег");
        ourMap.put("Серегин", "Илья");
        ourMap.put("Алексеев", "Иван");
        ourMap.put("Федоров", "Фёдор");
        ourMap.put("Олегов", "Жора");
        ourMap.put("Петров", "Илья");
        ourMap.put("Степанов", "Фёдор");
        return ourMap;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

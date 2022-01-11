package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String , String > ourMap = new HashMap<>();
        ourMap.put("Иванов", "Иван");
        ourMap.put("Петров", "Олег");
        ourMap.put("Сидоров", "Сидор");
        ourMap.put("Олегов", "Олег");
        ourMap.put("Серегин", "Сергей");
        ourMap.put("Алексеев", "Алексей");
        ourMap.put("Федоров", "Фёдор");
        ourMap.put("Жориков", "Жора");
        ourMap.put("Ильин", "Ильин");
        ourMap.put("Степанов", "Фёдор");
        return ourMap;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        Set<String> names = new HashSet<>();
        Map<String, String> copyMap = new HashMap<>(map);

        Iterator<Map.Entry<String,String>> iterator = copyMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> currentValue = iterator.next();
            String name = currentValue.getValue();
            if (names.contains(name)) removeItemFromMapByValue(map,name);
                else names.add(name);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> ourMap = createMap();
//        removeTheFirstNameDuplicates(ourMap);
//        for (Map.Entry<String,String> current: ourMap.entrySet()
//             ) {
//            System.out.println(current.getKey()+" - "+current.getValue());
//        }
    }
}

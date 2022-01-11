package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Иванов", dateFormat.parse("JULY 13 2001"));
        map.put("Петров", dateFormat.parse("JULY 13 2001"));
        map.put("Сидоров", dateFormat.parse("JULY 13 2001"));
        map.put("Федоров", dateFormat.parse("JULY 13 2001"));
        map.put("Жориков", dateFormat.parse("JULY 13 2001"));
        map.put("Авдотьев", dateFormat.parse("JULY 13 2001"));
        map.put("Ильин", dateFormat.parse("JULY 13 2001"));
        map.put("Осеньев", dateFormat.parse("OCTOBER 13 2001"));
        map.put("Зимов", dateFormat.parse("JANUARY 13 2001"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Date> currentValue = iterator.next();
            if (currentValue.getValue().getMonth()>=5 &&currentValue.getValue().getMonth()<8) iterator.remove();
        }

    }

    public static void main(String[] args) {

    }
}

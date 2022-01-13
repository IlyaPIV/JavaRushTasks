package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> cities = new ArrayList<>();
        List<String> list = new ArrayList<>();

        while (true) {
            String city = "";
            String family = "";
            city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            cities.add(city);
            list.add(family);
        }

        // Read the house number
        String city = reader.readLine();
        int val = cities.indexOf(city);

        if (0 <= val && val < list.size()) {
            String familyName = list.get(val);
            System.out.println(familyName);
        }
    }
}

package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            try {
                int x = Integer.parseInt(br.readLine());
                numbers.add(x);
            } catch (NumberFormatException e) {
                for (Integer num:
                     numbers) {
                    System.out.println(num);
                }
                break;
            } catch (IOException e){
                System.out.println(e.getClass());
            }

        }
    }
}

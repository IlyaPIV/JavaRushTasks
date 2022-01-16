package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        SimpleDateFormat formatInput =new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat formatOutput = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        try {
            Date date = formatInput.parse(str);

            System.out.println((formatOutput.format(date)).toUpperCase());
        } catch (Exception e){
            System.out.println("неверный формат ввода даты");
        }
    }
}

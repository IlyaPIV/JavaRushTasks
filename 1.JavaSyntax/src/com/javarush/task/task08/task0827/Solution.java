package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
//        System.out.println(isDateOdd("JANUARY 1 2000"));
//        System.out.println(isDateOdd("JANUARY 2 2020"));
//        System.out.println(isDateOdd("FEBRUARY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat formater = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar dateCheck = new GregorianCalendar();
        Calendar dateStart = new GregorianCalendar();
        Date tempDate = new Date();
        try {
            tempDate = formater.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        };
        dateCheck.setTime(tempDate);
        tempDate.setDate(1);
        tempDate.setMonth(0);
        dateStart.setTime(tempDate);
        int daysDiff = dateCheck.get(Calendar.DAY_OF_YEAR)-dateStart.get(Calendar.DAY_OF_YEAR)+1;
    //    return daysDiff;
        return daysDiff%2!=0;
    }
}

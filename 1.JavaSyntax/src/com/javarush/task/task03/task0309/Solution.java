package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int sum = 0;
        String leftSumm = "";
        String out;
        for (int i=1; i<6; i++){
            sum = sum+i;
            if (i==1) {
                leftSumm = Integer.toString(i);
                out = leftSumm;
                
            } else {
                leftSumm = leftSumm+"+"+Integer.toString(i);
                out = leftSumm + "="+sum;
            }
            System.out.println(out);
        }
    }
}

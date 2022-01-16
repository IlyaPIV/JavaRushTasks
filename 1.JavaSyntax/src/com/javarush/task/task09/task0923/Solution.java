package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<Character> glassnye = new ArrayList<>();
        ArrayList<Character> soglasnye = new ArrayList<>();
        char[] charString = str.toCharArray();
        for (char symb: charString
             ) {
            if (!Character.isWhitespace(symb)) {
                if (isVowel(symb)) glassnye.add(symb); else soglasnye.add(symb);
            }
        }
        for (char symb: glassnye
             ) {
            System.out.print(symb+" ");
        }
        System.out.println();
        for (char symb: soglasnye
        ) {
            System.out.print(symb+" ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
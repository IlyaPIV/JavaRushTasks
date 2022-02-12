package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String value = br.readLine();
            switch (value){
                case Planet.EARTH: {
                    thePlanet = Earth.getInstance();
                    break;}
                case Planet.MOON: {
                    thePlanet = Moon.getInstance();
                    break;
                }
                case Planet.SUN: {
                    thePlanet = Sun.getInstance();
                    break;
                }
                default: thePlanet = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

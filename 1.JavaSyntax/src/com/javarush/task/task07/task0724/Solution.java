package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        ArrayList<Human> family = new ArrayList<Human>();
        family.add(new Human("Катя",false,55));
        family.add(new Human("Алла",false,63));
        family.add(new Human("Петя",true,60));
        family.add(new Human("Гена",true,65));
        family.add(new Human("Фёдор",true,40, family.get(2), family.get(1)));
        family.add(new Human("Ольга",false,40, family.get(3), family.get(0)));
        family.add(new Human("Иван",true,12, family.get(3), family.get(0)));
        family.add(new Human("Олег",true,8, family.get(3), family.get(0)));
        family.add(new Human("Даша",false,4, family.get(3), family.get(0)));
        for (int i = 0; i < family.size(); i++) {
            System.out.println(family.get(i));
        }
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
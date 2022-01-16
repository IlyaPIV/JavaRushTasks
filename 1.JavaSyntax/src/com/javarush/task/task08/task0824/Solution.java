package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human();
        child1.name = "Ребёнок_1";
        child1.age = 10;
        Human child2 = new Human();
        child2.name = "Ребёнок_2";
        child2.age = 12;
        child2.sex = true;
        Human child3 = new Human();
        child3.name = "Ребёнок_3";
        child3.age = 16;
        child3.sex = true;
        Human father = new Human();
        father.name = "Батя";
        father.age = 44;
        father.sex = true;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        Human mother = new Human();
        mother.name = "Матя";
        mother.age = 32;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);
        Human grandDad1 = new Human();
        grandDad1.name = "Дед_1";
        grandDad1.age = 69;
        grandDad1.sex = true;
        grandDad1.children.add(father);
        Human grandDad2 = new Human();
        grandDad2.name = "Дед_2";
        grandDad2.age = 59;
        grandDad2.sex = true;
        grandDad2.children.add(mother);
        Human grandMom1 = new Human();
        grandMom1.name = "Баба_1";
        grandMom1.age = 59;
        grandMom1.children.add(father);
        Human grandMom2 = new Human();
        grandMom2.name = "Баба_2";
        grandMom2.age = 55;
        grandMom2.children.add(mother);

        ArrayList<Human> family = new ArrayList<>();
        family.add(grandDad1);
        family.add(grandDad2);
        family.add(grandMom1);
        family.add(grandMom2);
        family.add(father);
        family.add(mother);
        family.add(child1);
        family.add(child2);
        family.add(child3);

        for (Human member:
             family) {
            System.out.println(member.toString());
        }
    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

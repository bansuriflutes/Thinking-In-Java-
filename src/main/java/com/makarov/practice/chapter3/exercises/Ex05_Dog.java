package com.makarov.practice.chapter3.exercises;

public class Ex05_Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Ex05_Dog spot = new Ex05_Dog();
        Ex05_Dog scruffy = new Ex05_Dog();
        spot.name = "spot";
        spot.says = "wof-wof";
        scruffy.name = "scruffy";
        scruffy.says = "bark - bark";


        System.out.println(spot.name + " says " + spot.says + " \n"
                + scruffy.name + " says " + scruffy.says);
    }
}

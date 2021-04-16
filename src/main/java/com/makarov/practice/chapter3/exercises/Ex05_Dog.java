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
        Ex05_Dog sparky = new Ex05_Dog();
        sparky.name = "sparky";
        sparky.says = "Grrrr";
        spot = sparky;
        System.out.println(sparky == spot);//true
        System.out.println(scruffy == spot);//false
        System.out.println(sparky.equals(spot));//true
        System.out.println(scruffy.equals(spot));//false
    }
}

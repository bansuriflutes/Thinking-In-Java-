package com.makarov.practice.chapter2.exercises;

/**
 * @class OneStaticField.
 * Java program showed behavior static and nonstatic fields.
 * @author Oleksandr Makarov
 * @author fleitist@gmail.com
 * @version 1.0
 */


public class OneStaticField {
    static int x = 25;
    int c = 3;
    public static void main(String[] args) {
        //static
        OneStaticField osf1 = new OneStaticField();
        osf1.x++;
        OneStaticField osf2 = new OneStaticField();

        //non static
        OneStaticField osf3 = new OneStaticField();
        osf3.c++;
        OneStaticField osf4 = new OneStaticField();

        System.out.println("One instance for static osf1 and for osf2 \n" + "osf1.x increment = " + osf1.x +
                "*** but osf2.c not increment and does not matter = " + osf2.x);

        System.out.println("Nonstatic field different for other objects \n" +
                " osf3.c increment and = " + osf3.c + " " + " but osf4.c not increment and = " + osf4.c);

    }

}

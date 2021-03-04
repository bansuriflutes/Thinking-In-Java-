package com.makarov.practice.chapter2.exercises;

/**
 * @class Ex08_OneStaticField.
 * Java program showed behavior static and nonstatic fields.
 * @version 1.0
 */


public class Ex08_OneStaticField {
    public static void main(String[] args) {
        //static field x = 0;
        Ex08_1_StaticField osf1 = new Ex08_1_StaticField();
        Ex08_1_StaticField osf2 = new Ex08_1_StaticField();
        Ex08_1_StaticField osf3 = new Ex08_1_StaticField();
        osf2.x++;


        //non static field = 0;
        Ex08_1_StaticField osf4 = new Ex08_1_StaticField();
        Ex08_1_StaticField osf5 = new Ex08_1_StaticField();
        Ex08_1_StaticField osf6 = new Ex08_1_StaticField();
        osf5.c++;
        osf6.c = 24;

        //static field common for all object
        System.out.println("By default x = 0");
        System.out.println("static osf1 = " + osf1.x + " \n" + "static osf2 = " + osf2.x +
                " \n" + "static osf3 = " + osf3.x);//return x = 1, x = 1, x =1

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //nonstatic field changed for every object
        System.out.println("By default c = 0");
        System.out.println("nonstatic osf4 = " + osf4.c + " \n" + "nonstatic osf5 = " + osf5.c +
                " \n" + "nonstatic osf6 = " + osf6.c);//return c = 0, c = 1, c = 24

    }

}

package com.makarov.practice.chapter2.exercises;

/**
 * @class AutomaticPackingOfPrimitives.
 * Java program showed automatic packing of primitives.
 * @author Oleksandr Makarov
 * @author fleitist@gmail.com
 * @version 1.0
 */

public class AutomaticPackingOfPrimitives {

    int x = 5;
    char ch;

    public static void main(String[] args) {
        AutomaticPackingOfPrimitives apop = new AutomaticPackingOfPrimitives();
        apop.ch = '$';
        char c = apop.ch;

        System.out.println("Primitive char type ch in object wrapper: " + apop.ch +
                "\nPrimitive type ch in object wrapper into just primitive char c : " + c + "\n");

        apop.x = 25;
        int y = apop.x;

        System.out.println("Primitive int type x in object wrapper: " + apop.x +
                "\nPrimitive type x in object wrapper into just primitive int y : " + y);
    }
}

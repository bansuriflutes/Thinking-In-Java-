package com.makarov.practice.chapter3.exercises;

/**
 *  Show that hex and octal notations work with long values. Use
 * Long.toBinaryString( ) to display the results.
 */

public class Ex07_HexAndOctalWithLongLiterals {
    public static void main(String[] args) {
        long num1 = 0x2f;//Hexadecimal (lowercase)
        System.out.println("Hexadecimal (lowercase) num1: " + Long.toBinaryString(num1));
        long num2 = 0X2f;//Hexadecimal (uppercase)
        System.out.println("Hexadecimal (uppercase) num2: " + Long.toBinaryString(num2));
        long num3 = 0177;// Octal (leading zero)
        System.out.println("Octal (leading zero) num3: " + Long.toBinaryString(num3));
    }
}/* Output:
Hexadecimal (lowercase) num1: 101111
Hexadecimal (uppercase) num2: 101111
Octal (leading zero) num3: 1111111

*///:~

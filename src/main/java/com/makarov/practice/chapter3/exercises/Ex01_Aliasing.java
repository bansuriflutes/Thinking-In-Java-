package com.makarov.practice.chapter3.exercises;

/**
 * @clss Ex01_Aliasing
 * class demonstrate aliasing
 *
 */

public class Ex01_Aliasing {
    /**create the float variable*/
    float f;
    public static void main(String[] args) {
        /**Create 2 new object, they have different links*/
        Ex01_Aliasing sign1 = new Ex01_Aliasing();
        Ex01_Aliasing sign2 = new Ex01_Aliasing();

        /**call the variable f and assignment different numbers*/
        sign1.f = 3.14f;
        sign2.f = 5.3f;
        /**Print number. Output: sign1.f = 3.14, sign2.f = 5.3*/
        System.out.println("First = " + sign1.f);
        System.out.println("Second = " + sign2.f);
        System.out.println("<========================>");
        /**Aliasing sigh1 value of sign2. From this moment they have
         * similar link*/
        sign1 = sign2;
        /**Print number. Output: sign1.f = 5.3, sign2.f = 5.3*/
        System.out.println("First = " + sign1.f);
        System.out.println("Second = " + sign2.f);
        System.out.println("***************************");
        /**Rewrite new objects with different links*/
        sign1 = new Ex01_Aliasing();
        sign2 = new Ex01_Aliasing();
        /**assignment different numbers*/
        sign1.f = 2.345f;
        sign2.f = 3.14f;
        /**Print number. Output: sign1.f = 2.345, sign2.f = 3.14*/
        System.out.println("First = " + sign1.f);
        System.out.println("Second = " + sign2.f);
    }

}

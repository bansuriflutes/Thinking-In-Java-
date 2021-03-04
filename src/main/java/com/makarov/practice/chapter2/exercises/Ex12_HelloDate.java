package com.makarov.practice.chapter2.exercises;

//: object/Ex12_HelloDate.java
import java.util.*;
/**
 * <p><b>
 * Exercise 12: Find the code for the second version of Ex12_HelloDate.java, which is the simple comment documentation
 * example. Execute Javadoc on the file and view the results with your Web browser.
 * </b><p>
 * <b>The first Thinking in Java example program.</b>
 * <i><b>Displays a string and today's date.</b></i>
 * @version 2.0
 * @return the image at the specified URL
 * @see Ex12_HelloDate
 */
public class Ex12_HelloDate {
    /** Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
} /* Output: (55% match)
Hello, it’s:
Wed Oct 05 14:39:36 MDT 2005
*///:~


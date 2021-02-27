package com.makarov.practice.javadoc;

//: object/Date.java
import java.util.*;

/**
 *The first programm-example the book.
 * Prints line and current date.
 * @author Oleksandr Makarov
 * @author fleitist@gmail.com
 * @version 1.0
*/
public class Date {
	/***
	 * Entry point into class and application.
	 * @param args array Strings arguments
	 * @throws exceptions Exception don'throws
	*/
  public static void main(String[] args) {
    System.out.println("Hello, now: ");
    System.out.println(new Date());
  }
} 
/* Output: (55% match)
Hello, today:
Saturday February 27 13:54:00 MDT 2021
*///:~
package com.makarov.practice.chapter2.javadoc;

//: javadoc/Date.java
import java.util.*;

/**
 *The first program-example the book.
 * Prints line and current date.
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
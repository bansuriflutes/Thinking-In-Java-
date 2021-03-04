package com.makarov.practice.chapter2.exercises;

import java.util.Date;

/**
 * @class Ex04_DataOnly.
 * Java program to demonstrate dataOnly() method
 * @version 1.0
 */

public class Ex04_DataOnly {
  public Object dataOnly() {
    Date d = new Date();
    return d;
  }
  public static void main(String[] args) {
    Ex04_DataOnly data = new Ex04_DataOnly();
    data.dataOnly();

    System.out.println("Class Ex04_DataOnly give us the actual date and time: " + data.dataOnly());
  }
}

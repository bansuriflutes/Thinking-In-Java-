package com.makarov.practice.chapter2.exercises;

import java.util.Date;

/**
 * @class DataOnly.
 * Java program to demonstrate dataOnly() method
 * @author Oleksandr Makarov
 * @author fleitist@gmail.com
 * @version 1.0
 */

public class DataOnly {
  public Object dataOnly() {
    Date d = new Date();
    return d;
  }
  public static void main(String[] args) {
    DataOnly data = new DataOnly();
    data.dataOnly();

    System.out.println("Class DataOnly give us the actual date and time: " + data.dataOnly());
  }
}

package com.makarov.practice.chapter2.exercises;

import java.lang.Class;
/**
 * @class Incrementable.
 * Java program return increment number from StaticTest class
 * @author Oleksandr Makarov
 * @author fleitist@gmail.com
 * @version 1.0
 */
public class Incrementable {

  static int increment() {
    int res = StaticTest.i++;
    return res;
  }
  public static void main(String[] args) {
    Incrementable inc = new Incrementable();
    //3 ways to call a static method
    inc.increment();// 47
    Incrementable.increment();//47 + 1 = 48
    increment();//48 + 1 = 49

    System.out.println("Return increment number: " + increment());//49+1=50
  }
}

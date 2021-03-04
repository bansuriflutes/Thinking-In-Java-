package com.makarov.practice.chapter2.exercises;

/**
 * @class Ex07_Incrementable.
 * Java program return increment number from StaticTest class
 * @version 1.0
 */
public class Ex07_Incrementable {

  static int increment() {
    int res = 5;
    return ++res;
  }
  public static void main(String[] args) {
    Ex07_Incrementable inc = new Ex07_Incrementable();
    //3 ways to call a static method
    inc.increment();// 47
    Ex07_Incrementable.increment();
    increment();

    System.out.println("Return increment number: " + increment());
  }
}

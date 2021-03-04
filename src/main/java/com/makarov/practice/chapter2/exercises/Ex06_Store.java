package com.makarov.practice.chapter2.exercises;

/**
 * @class Ex06_Store.
 * Java program to returns the length of the string multiplied by 2
 * @version 1.0
 */
public class Ex06_Store {
  int storage(String s) {
      return s.length() * 2;
  }

    public static void main(String[] args) {
        Ex06_Store st = new Ex06_Store();

        System.out.println("The length of the string \"Hello, world!\" * 2 = " + st.storage("Hello, world!") + " symbols");
    }
}

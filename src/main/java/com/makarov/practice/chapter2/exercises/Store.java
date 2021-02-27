package com.makarov.practice.chapter2.exercises;

/**
 * @class Store.
 * Java program to returns the length of the string multiplied by 2
 * @author Oleksandr Makarov
 * @author fleitist@gmail.com
 * @version 1.0
 */
public class Store {
  int storage(String s) {
      return s.length() * 2;
  }

    public static void main(String[] args) {
        Store st = new Store();

        System.out.println("The length of the string \"Hello, world!\" * 2 = " + st.storage("Hello, world!") + " symbols");
    }
}

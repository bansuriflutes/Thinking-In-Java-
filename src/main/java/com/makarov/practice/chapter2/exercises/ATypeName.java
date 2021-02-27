package com.makarov.practice.chapter2.exercises;
  
import java.lang.Class;
import java.util.*;
/**
 * @class ATypeName.
 * Java program to demonstrate getTypeName() method
 * @author Oleksandr Makarov
 * @author fleitist@gmail.com
 * @version 1.0
*/ 
  
public class ATypeName {
  
  public static void main(String[] args) {
  
  // returns the Class object for this class
  ATypeName myClass = new ATypeName();
 
  System.out.println("TypeName of myClass: " + myClass.toString());
  }
}
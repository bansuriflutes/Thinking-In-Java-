package com.makarov.practice.chapter2.exercises;

//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.
class Tree {
    int height;
    /**Planting a seedling*/
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }
    /**Creating new Tree*/
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " +
                height + " feet tall");

    }
    /**Show how to grows up the tree*/
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }
    /**Show how to grows up the tree*/
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}
public class Ex16_Overloading {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
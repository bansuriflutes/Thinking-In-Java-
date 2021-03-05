package com.makarov.practice.chapter3.exercises;

//: operators/PassObject.java
// Passing objects to methods may not be
// what you’re used to.
/**@class Num*/
class Num {
    float f;
}

/**@class Ex02_PassObject*/
public class Ex02_PassObject {

    /** method 'f' take argument from class 'Num'*/
    static void f(Num y) {
        y.f = 3.14f;
    }
    public static void main(String[] args) {

        Num x = new Num();
        x.f = 4.31f;
        System.out.println("First from object class 'Num' x.c = " + x.f);
        f(x);
        System.out.println("Second from method 'f',  x.c = " + x.f);
    }
}/* Output:
1 : x.c: a
2 : x.c: z
*///:~

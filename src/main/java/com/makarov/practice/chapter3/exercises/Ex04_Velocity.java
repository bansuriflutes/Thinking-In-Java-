package com.makarov.practice.chapter3.exercises;

import java.util.Random;
/**
 * @class Ex04_Velocity.
 * That program calculates velocity using a constant distance and a
 * constant time
 */

public class Ex04_Velocity {
    public static void main(String[] args) {
        double velocity = 0;
        int distance = 0;
        int time = 0;

        Random r = new Random();
        distance = r.nextInt(250) + 1;
        time = r.nextInt(125) + 1;

        velocity = ((double) distance / time) * 60;
        System.out.println("Car drove " + distance + " km");
        System.out.println("For  " + time + " min");
        System.out.println("velocity is " + velocity + " km - p/h");
    }
}/* Example output:
Car drove 187 km
For  68 min
velocity is 165.0 km - p/h
*///:~

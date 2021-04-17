package com.makarov.practice.chapter3.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 *   Write a program that simulates coin-flipping.
 */
public class Ex06_Throw_A_Coin {
    public static void main(String[] args) {
        System.out.println("*******\nHello player! Greeting you the game 'Head or Tail'");
        System.out.println("What's your choice?\nhead... or tail...???");
        String scan = new Scanner(System.in).nextLine();
        System.out.println("Throw a coin!");
        Random random = new Random();
        int chance = random.nextInt(2) + 1;
        if (scan.equals("head") || (scan.equals("Head") || (scan.equals("HEAD")))) {
            if (chance == 1) {
                System.out.println("You got a 'Head'... You're a winner!");
            } else {
                System.out.println("You got a 'Tail'... You're loose");
            }
        } if (scan.equals("tail") || scan.equals("Tail") || scan.equals("TAIL")){
            if (chance == 2) {
                System.out.println("You got a 'Tail'... You're a winner!");
            } else {
                System.out.println("You got a 'Head'... You're loose");
            }
        }

    }
}

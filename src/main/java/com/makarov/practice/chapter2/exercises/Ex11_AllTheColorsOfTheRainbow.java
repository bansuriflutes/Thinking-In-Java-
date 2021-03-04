package com.makarov.practice.chapter2.exercises;

/**
 * @class Ex11_AllTheColorsOfTheRainbow.
 * Java program .
 * @version 1.0
 */

public class Ex11_AllTheColorsOfTheRainbow {

    int anIntegerRepresentingColors;
  /**
   * @param create method changeTheHueOfTheColor, it change the colors
  */
  void changeTheHueOfTheColor(int newHue) {
    System.out.println(anIntegerRepresentingColors = newHue);
  }
  /**
   * @param create method main, this is entry point
   * */
  public static void main(String[] args) {

      /**
       * Create variable "rainbow" with type of "Ex11_AllTheColorsOfTheRainbow"
       */
      Ex11_AllTheColorsOfTheRainbow rainbow = new Ex11_AllTheColorsOfTheRainbow();

      /**
       * Return method "changeTheHueOfTheColor" with parameter "newHue"
       */
      rainbow.changeTheHueOfTheColor(5);


  }
}

package com.william;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println(calcFeetAndInchesToCentimeters(3));
    System.out.println(calcFeetAndInchesToCentimeters(1, 12));
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
    if(feet < 0 || inch < 0 || inch > 12) {
      return -1;
    }
    return calcFeetAndInchesToCentimeters(feet * 12 + inch);
  }

  public static double calcFeetAndInchesToCentimeters(double inch) {
    return inch * 2.54;
  }
}

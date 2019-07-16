package net.amazingcity;

import java.util.Scanner;

public class Main {

  private static String name;
  
//  private String name;

  public static void main(String[] args) {
    // write your code here
//    System.out.println(Integer.MAX_VALUE);
    int min = 0, max = 0;
    int counter = 0, sum = 0;

    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.println("Enter number #" + (counter + 1) + ": ");
      if(scanner.hasNextInt()) {

        int number = scanner.nextInt();
        sum += number;
        if(counter == 0) {
          min = number;
          max = number;
        } else {
          min = (number < min) ? number : min;
          max = (number > max) ? number : max;
        }

        counter++;
        scanner.nextLine();
      } else {
        scanner.nextLine();
        break;
      }
    }
    System.out.println("The sum of all the numbers is " + sum + ", the maximum number is " + max + " and the minimum number is " + min + ".");
    scanner.close();
  }
}

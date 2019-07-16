package net.amazingcity;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    int counter = 0, sum = 0;
    int[] userInput = new int[10];
    Scanner scanner = new Scanner(System.in);

    while(counter < 3) {
      System.out.println("Please enter the #" + (counter + 1) + ":");
      if(scanner.hasNextInt()) {
        userInput[counter] = scanner.nextInt();
        sum += userInput[counter];
        counter++;
      } else {
        System.out.println("Invalid number.");
      }
      scanner.nextLine();
    }
    scanner.close();
    for(int i = 0; i < userInput.length; i++) {
      System.out.println(userInput[i]);
    }
    System.out.println("The sum of " + counter + " numbers is " + sum + ".");
  }
}

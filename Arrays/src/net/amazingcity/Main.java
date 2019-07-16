package net.amazingcity;

import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // write your code here
    System.out.println("Please enter the number of integers you want to enter:\n");
    int number = scanner.nextInt();
    int[] array = getIntegers(number);
    printArray(array);
    int[] anotherArray = sortArray(array);
    printArray(anotherArray);
    printArray(array);
  }

  public static int[] getIntegers(int n) {
    int[] array = new int[n];
    for(int i = 0; i < array.length; i++) {
      System.out.print("Please enter number " + (i + 1) + ": ");
      array[i] = scanner.nextInt();
    }
    return array;
  }

  public static void printArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      System.out.println("Number " + (i + 1) + ": " + array[i]);
    }
  }

  public static int[] sortArray(int[] array) {
    int[] result = new int[array.length];
    for(int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }
    for(int i = 0; i < result.length; i++) {
      for(int j = i + 1; j < result.length; j++) {
        if(result[i] < result[j]) {
          int temp = result[i];
          result[i] = result[j];
          result[j] = temp;
        }
      }
    }
    return result;
  }
}

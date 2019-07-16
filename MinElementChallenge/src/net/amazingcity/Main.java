package net.amazingcity;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // write your code here
    System.out.println("Enter the number of elements you want to enter: ");
    int n = scanner.nextInt();
    scanner.nextLine();
    int[] array = readIntegers(n);
    System.out.println("The minimum of the array " + Arrays.toString(array) + " is " + findMin(array) + ".");
    int[] reverseArray = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(Arrays.toString(reverseArray));
    reverse(reverseArray);
    System.out.println(Arrays.toString(reverseArray));
  }

  private static int findMin(int[] array) {
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < array.length; i++) {
      if(min > array[i]) min = array[i];
    }
    return min;
  }

  private static int[] readIntegers(int n) {
    int[] array = new int[n];
    while(n > 0) {
      System.out.println("Please enter number " + (array.length - n) + ": ");
      array[array.length - n] = scanner.nextInt();
      scanner.nextLine();
      n--;
    }
    return array;
  }

  private static void reverse(int[] array) {
    if(array.length < 2) return;
    for(int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }
  }

}

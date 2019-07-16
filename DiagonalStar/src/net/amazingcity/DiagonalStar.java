package net.amazingcity;

public class DiagonalStar {

  private static final String INVALID_VALUE = "Invalid Value";

  public static void main(String[] args) {
    printSquareStar(10);
  }

  public static void printSquareStar(int n) {
    if(n < 5) {
      System.out.println(INVALID_VALUE);
      return;
    }
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
          System.out.print("*");
        } else  {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

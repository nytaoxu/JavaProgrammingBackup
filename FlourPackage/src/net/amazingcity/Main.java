package net.amazingcity;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println(canPack(2, 2, 12));
    System.out.println(canPack(1, 3, 4));
  }

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if(bigCount < 0 || smallCount < 0 || goal < 0) {
      return false;
    }
    if(goal == 0) {
      return true;
    }
    if(canPack(bigCount - 1, smallCount, goal - 5) || canPack(bigCount, smallCount - 1, goal - 1)) {
      return true;
    }
    return false;
  }
}

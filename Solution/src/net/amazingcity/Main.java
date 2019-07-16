package net.amazingcity;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    String s = "([]{})";
    System.out.println(isValid(s));
    int[] x = new int[] {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(x));
  }

  public static boolean isValid(String s) {
    if(s == "") {
      return true;
    }
    if(s.length() % 2 == 1) {
      return false;
    }
    char x = s.charAt(0);
    char y = s.charAt(s.length() - 1);
    if(!isCompatible(x, y)) {
      return false;
    }
    if(s.length() == 2) return true;
    return isValid(s.substring(1, s.length() - 1));
  }

  public static boolean isCompatible(char a, char b) {
    if((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}')) {
      return true;
    }
    return false;
  }
}

package com.william;

public class Main {

  public static void main(String[] args) {
    // write your code here

    // 2 ^ 32 = 4294967296
    int iMin = -2147483648;
    int iMax = 2_147_483_647;

    // 2 ^ 8 = 256
    byte bMax = 127;
    byte bMin = -128;

    // 2 ^ 16 = 65536
    short sMax = 32767;
    short sMin = -32768;

    // 2 ^ 64 = 9_223_372_036_854_775_807
    long lMax = 9_223_372_036_854_775_807L;
    long lMin = -9_223_372_036_854_775_808L;

    byte b = 127;
    short s = 32767;
    int i = 2_147_483_647;
    long l = 5000 + 10 * (b + s + i);

    System.out.println("long = " + l);
    System.out.println(0.1d + 0.2d);

  }
}

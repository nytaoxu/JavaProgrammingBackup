package net.amazingcity;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println(getLargestPrime(1001));
  }

  public static int getLargestPrime(int n) {

    if(n < 2) {
      return -1;
    }
    if(isPrime(n)) {
      return n;
    }
    int start = (int) Math.floor(n / 2);
    for(int i = start; i >= 2; i--) {
      if(isPrime(i) && n % i == 0) {
        return i;
      }
    }
    return -1;
  }

  public static boolean isPrime(int n) {
    if(n < 2) {
      return false;
    }
    int sqrt = (int) Math.floor(Math.sqrt(n));
    for(int i = sqrt; i >= 2; i--) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

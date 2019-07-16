package net.amazingcity;

import java.util.Scanner;

public class Main {

  public static Scanner scanner;

  public static void main(String[] args) {
    // write your code here
    scanner = new Scanner(System.in);
    Hamburger hamburger = new Hamburger("Flat", "Beef", 2.5d);
    hamburger.chooseMenu();
    hamburger.showPrice();

    Hamburger healthyBurger = new HealthyBurger("Chicken", 3.5d);
    healthyBurger.chooseMenu();
    healthyBurger.calculatePrice();
    healthyBurger.showPrice();

    Hamburger deluxeBurger = new DeluxeBurger("roll type", "duck", 5.5d);
    deluxeBurger.calculatePrice();
    deluxeBurger.showPrice();
    scanner.close();
  }
}

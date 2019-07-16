import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    Scanner scanner = new Scanner(System.in);

    int year = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Please enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Welcome, " + name + "!");

    System.out.println("Year is " + year);
    scanner.close();
  }
}

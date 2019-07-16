package net.amazingcity;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Movie m = new Movie("Cookery");
    Movie s = new ManOfSteel();
    Movie n = new Minions();
    System.out.println(m.plot());
    System.out.println(s.plot());
    System.out.println(n.plot());
  }
}

class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public String plot() {
    return "No plot here.";
  }
}

class ManOfSteel extends Movie {
  public ManOfSteel() {
    super("ManOfSteel");
  }

  @Override
  public String plot() {
    return "How superman is generated.";
  }
}

class Minions extends Movie {
  public Minions() {
    super("Minions");
  }

  @Override
  public String plot() {
    return "The cute minions are coming...";
  }
}
package net.amazingcity;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Infiniti infiniti = new Infiniti();
    infiniti.startEngine();
    infiniti.brake();
    infiniti.getCylinders();
    System.out.println(infiniti.getClass().getSimpleName());
  }

}

class Car {
  private String name;
  private boolean engine;
  private int cylinders;
  private int wheels;

  public Car(String name, int cylinders) {
    this.name = name;
    this.cylinders = cylinders;
    this.engine = true;
    this.wheels = 4;
  }

  public String getName() {
    return name;
  }

  public boolean isEngine() {
    return engine;
  }

  public int getCylinders() {
    return cylinders;
  }

  public int getWheels() {
    return wheels;
  }

  public void startEngine() {
    System.out.println("Car: startEngine() called.");
    this.engine = true;
  }

  public void brake() {
    System.out.println("Car: brake() called.");
    this.engine = false;
  }
}

class Infiniti extends Car {
  public Infiniti() {
    super("Infiniti", 4);
  }

  public void startEngine() {
    System.out.println("Infiniti: startEngine() called.");
    super.startEngine();
  }
}

class Lexus extends Car {
  public Lexus() {
    super("Lexus", 4);
  }

  public void startEngine() {
    System.out.println("Lexus: startEngine() called.");
    super.startEngine();
  }
}

class Porsche extends Car {
  public Porsche() {
    super("Porsche", 4);
  }

  public void startEngine() {
    System.out.println("Porsche: startEngine() called.");
    super.startEngine();
  }
}

class Ferrari extends Car {
  public Ferrari() {
    super("Ferrari", 4);
  }

  public void startEngine() {
    System.out.println("Ferrari: startEngine() called.");
    super.startEngine();
  }
}

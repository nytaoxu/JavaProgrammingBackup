package net.amazingcity;

public class Hamburger {
  // write your code here

  private String rollType;
  private String meat;
  private double basePrice;
  private double total;

  private boolean lettuce;
  private boolean tomato;
  private boolean carrot;
  private boolean pepper;

  private double lettucePrice = 0.5d;
  private double tomatoPrice = 0.7d;
  private double carrotPrice = 0.32d;
  private double pepperPrice = 0.57d;

  public Hamburger(String rollType, String meat, double basePrice) {
    this.rollType = rollType;
    this.meat = meat;
    this.basePrice = basePrice;
  }

  public void setLettuce(boolean lettuce) {
    this.lettuce = lettuce;
  }

  public void setTomato(boolean tomato) {
    this.tomato = tomato;
  }

  public void setCarrot(boolean carrot) {
    this.carrot = carrot;
  }

  public void setPepper(boolean pepper) {
    this.pepper = pepper;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getTotal() {
    return total;
  }

  public double getBasePrice() {
    return basePrice;
  }

  public boolean isLettuce() {
    return lettuce;
  }

  public boolean isTomato() {
    return tomato;
  }

  public boolean isCarrot() {
    return carrot;
  }

  public boolean isPepper() {
    return pepper;
  }

  public double getLettucePrice() {
    return lettucePrice;
  }

  public double getTomatoPrice() {
    return tomatoPrice;
  }

  public double getCarrotPrice() {
    return carrotPrice;
  }

  public double getPepperPrice() {
    return pepperPrice;
  }

  public void chooseMenu() {
    handleItem("lettuce");
    handleItem("tomato");
    handleItem("carrot");
    handleItem("pepper");
  }

  public boolean getInput(String item) {
//    Scanner scanner = new Scanner(System.in);
    String input = "";
    char letter = ' ';
    do {
      System.out.println("For the type of " + getClass().getSimpleName() + ", do you want to add " + item + "? \n" +
          "Please enter either 'y' or 'n'");
      input = Main.scanner.nextLine();
      if(input.length() == 1) {
        letter = input.toLowerCase().charAt(0);
      }
    } while(letter != 'y' && letter != 'n');
//    scanner.close();
    return letter == 'y';
  }

  public void handleItem(String item, boolean choice) {
    switch(item) {
      case "lettuce":
        setLettuce(choice);
        break;
      case "tomato":
        setTomato(choice);
        break;
      case "carrot":
        setCarrot(choice);
        break;
      case "pepper":
        setPepper(choice);
        break;
      default:
        break;
    }
  }

  public void handleItem(String item) {
    boolean choice = getInput(item);
    handleItem(item, choice);
  }

  public double calculatePrice() {
    total = basePrice;
    if(lettuce) total += lettucePrice;
    if(tomato) total += tomatoPrice;
    if(carrot) total += carrotPrice;
    if(pepper) total += pepperPrice;
    return total;
  }

  public void separation() {
    System.out.println("\n*******************\n");
  }

  public void showPrice() {
    String result = "The base price for %s is %.2f, \n" +
        "Lettuce included? %b, the price is %.2f\n" +
        "Tomato included? %b, the price is %.2f\n" +
        "Carrot included? %b, the price is %.2f\n" +
        "Pepper included? %b, the price is %.2f\n" +
        "The total price would be %.2f";
    separation();
    System.out.println(String.format(result,
        getClass().getSimpleName(), basePrice, lettuce, lettucePrice, tomato, tomatoPrice, carrot, carrotPrice, pepper, pepperPrice, calculatePrice()));
    separation();
  }
}
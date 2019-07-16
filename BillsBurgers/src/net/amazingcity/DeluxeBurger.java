package net.amazingcity;

public class DeluxeBurger extends Hamburger {

  private boolean chips;
  private boolean drinks;

  private double chipsPrice;
  private double drinksPrice;

  public DeluxeBurger(String rollType, String meat, double basePrice) {
    super(rollType, meat, basePrice);
    chips = true;
    drinks = true;
    chipsPrice = 1.2d;
    drinksPrice = 1.5d;
    setLettuce(false);
    setCarrot(false);
    setTomato(false);
    setPepper(false);
  }

  @Override
  public double calculatePrice() {
    double total = getBasePrice();
    total += chipsPrice + drinksPrice;
    setTotal(total);
    return total;
  }

  @Override
  public void showPrice() {
    String result = "The base price for %s is %.2f\n" +
        "Chips is included, and the price is %.2f\n" +
        "Drinks is included, and the price is %.2f\n" +
        "The total price is %.2f";
    separation();
    System.out.println(String.format(result, getClass().getSimpleName(), getBasePrice(),
        chipsPrice,
        drinksPrice,
        getTotal()));
    separation();
  }
}

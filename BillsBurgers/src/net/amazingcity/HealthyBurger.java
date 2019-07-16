package net.amazingcity;

public class HealthyBurger extends Hamburger {

  private boolean potato;
  private boolean salmon;

  private double potatoPrice;
  private double salmonPrice;

  public HealthyBurger(String meat, double basePrice) {
    super("Brown Rye Bread Roll", meat, basePrice);
    potatoPrice = 0.63d;
    salmonPrice = 0.97d;
  }

  public void setPotato(boolean potato) {
    this.potato = potato;
  }

  public void setSalmon(boolean salmon) {
    this.salmon = salmon;
  }

  @Override
  public void chooseMenu() {
    super.chooseMenu();
    handleItem("potato");
    handleItem("salmon");
  }

  @Override
  public void handleItem(String item) {
    boolean choice = getInput(item);
    switch (item) {
      case "potato":
        setPotato(choice);
        break;
      case "salmon":
        setSalmon(choice);
        break;
      default:
        super.handleItem(item, choice);
        break;
    }
  }

  @Override
  public double calculatePrice() {
    double total = super.calculatePrice();
    if(potato) total += potatoPrice;
    if(salmon) total += salmonPrice;
    setTotal(total);
    return total;
  }

  @Override
  public void showPrice() {

    String result = "The base price for %s is %.2f\n" +
        "Lettuce included? %b, the price is %.2f\n" +
        "Tomato included? %b, the price is %.2f\n" +
        "Carrot included? %b, the price is %.2f\n" +
        "Pepper included? %b, the price is %.2f\n" +
        "Potato included? %b, the price is %.2f\n" +
        "Salmon include? %b, the price is %.2f\n" +
        "The total price would be %.2f";
    separation();
    System.out.println(String.format(result, getClass().getSimpleName(), getBasePrice(),
        isLettuce(), getLettucePrice(),
        isTomato(), getTomatoPrice(),
        isCarrot(), getCarrotPrice(),
        isPepper(), getPepperPrice(),
        potato, potatoPrice,
        salmon, salmonPrice,
        getTotal()));
    separation();
  }
}

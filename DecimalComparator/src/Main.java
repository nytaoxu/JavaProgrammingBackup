public class Main {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
  }

  public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
    boolean result = false;
    a = (int) (1000 * a);
    b = (int) (1000 * b);
    if(a == b) {
      result = true;
    }

    return result;
  }
}

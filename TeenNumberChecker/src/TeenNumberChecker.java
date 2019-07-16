public class TeenNumberChecker {

  public static void main(String[] args) {

    System.out.println(TeenNumberChecker.hasTeen(1,3,15));

  }

  public static void fiji() {

  }

  public static boolean hasTeen(int a, int b, int c) {
    class Helper {
      public boolean hasTeen(int a) {
        if(a >= 13 && a <= 19) {
          return true;
        }
        return false;
      }
    }
    Helper h = new Helper();
    return h.hasTeen(a) || h.hasTeen(b) || h.hasTeen(c);
  }
}
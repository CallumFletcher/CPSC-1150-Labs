package Lab7;

public class Rounding {
  public static void main(String[] args) {

    // part 1
    System.out.println(rounding(1.0));
    System.out.println(rounding(1.5));
    System.out.println(rounding(1.75));

    // part 2
    System.out.println(rounding("1.0"));
    System.out.println(rounding("1.5"));
    System.out.println(rounding("1.75"));

    // part 3
    System.out.println(rounding(3.14159, 0));
    System.out.println(rounding(3.14159, 2));
    System.out.println(rounding(3.14159, 4));

  }

  public static int rounding(double x) {
    int intLessThan = (int) x;
    if ((intLessThan + 0.5) > x) {
      return intLessThan;
    } else {
      return intLessThan + 1;
    }

  }

  public static String rounding(String x) {
    double d = Double.parseDouble(x);
    int roundedInt = rounding(d);
    return "" + roundedInt;
  }

  public static double rounding(double a, int b) {
    double step1 = a * Math.pow(10, b);
    int step2 = rounding(step1);
    return step2 / Math.pow(10, b);

  }
}

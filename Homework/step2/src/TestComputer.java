import java.util.Scanner;

public class TestComputer {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a, b;
    a = in.nextDouble();
    b = in.nextDouble();
    System.out.println(String.format("%.2f", add(a, b)));
    System.out.println(String.format("%.2f", sub(a, b)));
    System.out.println(String.format("%.2f", multi(a, b)));
    System.out.println(String.format("%.2f", divide(a, b)));
  }

  public static double add(double a, double b) {
    return a + b;
  }

  public static double sub(double a, double b) {
    return a - b;
  }

  public static double multi(double a, double b) {
    return a * b;
  }

  public static double divide(double a, double b) {
    if (b == 0)
      return 0.0;
    return a / b;
  }

}

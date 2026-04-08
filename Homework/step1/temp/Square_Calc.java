import java.util.Scanner;

class Rec {
  private double a;
  private double b;

  public Rec() {
    this(0.0, 0.0);
  }

  public Rec(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area() {
    return a * b;
  }
}

class Circle {
  private double r;

  private static double pi = Math.PI;

  public Circle() {
    this(0.0);
  }

  public Circle(double r) {
    this.r = r;
  }

  public double area() {
    return pi * r * r;
  }
}

public class Square_Calc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNext()) {
      double a1 = scanner.nextDouble();
      double b1 = scanner.nextDouble();

      double a2 = scanner.nextDouble();
      double b2 = scanner.nextDouble();

      double r1 = scanner.nextDouble();
      double r2 = scanner.nextDouble();

      Rec rec1 = new Rec(a1, b1);
      Rec rec2 = new Rec(a2, b2);
      Circle cir1 = new Circle(r1);
      Circle cir2 = new Circle(r2);

      System.out.printf("%.2f%n", rec1.area());
      System.out.printf("%.2f%n", rec2.area());
      System.out.printf("%.2f%n", cir1.area());
      System.out.printf("%.2f%n", cir2.area());

    }
    scanner.close();
  }
}

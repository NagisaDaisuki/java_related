import java.util.Scanner;

class Circle {
  public double r;

  public Circle(double r) {
    this.r = r;
  }

  public final double getC() {
    return 2 * Math.PI * r;
  }

  public double getArea() {
    return Math.PI * r * r;
  }

  // public double getV() {
  // return 0.0;
  // }
}

class CirCol extends Circle {
  private double h;

  public double getH() {
    return h;
  }

  CirCol(double r, double h) {
    super(r);
    this.h = h;
  }

  public double getArea() {
    return getC() * h + 2 * Math.PI * r * r;
  }

  public double getV() {
    return super.getArea() * h;
  }

}

class CirCone extends CirCol {
  public CirCone(double r, double h) {
    super(r, h);
  }

  public double getL() {
    return Math.sqrt(r * r + getH() * getH());
  }

  public double getArea() {
    return Math.PI * r * r + Math.PI * r * getL();
  }

  public double getV() {
    return 1.0 / 3.0 * Math.PI * r * r * getH();
  }
}

public class TestShape {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Circle c1 = new Circle(in.nextDouble());
    CirCol c2 = new CirCol(in.nextDouble(), in.nextDouble());
    CirCone c3 = new CirCone(in.nextDouble(), in.nextDouble());

    System.out.println(String.format("%.2f", c1.getC()) + ',' + String.format("%.2f", c1.getArea()));
    System.out.println(String.format("%.2f", c2.getArea()) + ',' + String.format("%.2f", c2.getV()));
    System.out.println(String.format("%.2f", c3.getArea()) + ',' + String.format("%.2f", c3.getV()));
  }
}

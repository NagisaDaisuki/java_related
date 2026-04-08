import java.util.Scanner;

public class TestPoint {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Point2D p1 = new Point2D(in.nextDouble(), in.nextDouble());
    Point2D p2 = new Point2D(in.nextDouble(), in.nextDouble());
    Point3D p3 = new Point3D(in.nextDouble(), in.nextDouble(), in.nextDouble());
    Point3D p4 = new Point3D();
    p4.setValue(in.nextDouble(), in.nextDouble(), in.nextDouble());
    System.out.println(String.format("%.2f", p1.dis()));
    System.out.println(String.format("%.2f", p1.dis(p2)));
    System.out.println(String.format("%.2f", p3.dis()));
    System.out.println(String.format("%.2f", p3.dis(p4)));
  }
}

class Point2D {
  private double x1;
  private double x2;

  public double getX1() {
    return x1;
  }

  public double getX2() {
    return x2;
  }

  public void setValue(double x1, double x2) {
    this.x1 = x1;
    this.x2 = x2;
  }

  public Point2D() {
    this(0.0, 0.0);
  }

  public Point2D(double x1, double x2) {
    this.x1 = x1;
    this.x2 = x2;
  }

  public double dis() {
    // return Math.sqrt(Math.pow(Math.abs(this.x1 - 0), 2) +
    // Math.pow(Math.abs(this.x2 - 0), 2));
    // return Math.sqrt(this.x1 * this.x1 + this.x2 * this.x2);
    return Math.hypot(this.x1, this.x2);
  }

  public double dis(Point2D p) {
    // return Math.sqrt(Math.pow(Math.abs(this.x1 - p.x1), 2) +
    // Math.pow(Math.abs(this.x2 - p.x2), 2));
    return Math.hypot(this.x1 - p.x1, this.x2 - p.x2);
  }
}

class Point3D extends Point2D {
  private double x3;

  public double getX3() {
    return x3;
  }

  public void setValue(double x1, double x2, double x3) {
    super.setValue(x1, x2);
    this.x3 = x3;
  }

  public Point3D() {
    super();
    this.x3 = 0.0;
  }

  public Point3D(double x1, double x2, double x3) {
    super(x1, x2);
    this.x3 = x3;
  }

  public double dis() {
    return Math.sqrt(getX1() * getX1() + getX2() * getX2() + x3 * x3);
  }

  public double dis(Point3D p) {
    double dx = getX1() - p.getX1();
    double dy = getX2() - p.getX2();
    double dz = getX3() - p.getX3();

    return Math.sqrt(dx * dx + dy * dy + dz * dz);

  }
}

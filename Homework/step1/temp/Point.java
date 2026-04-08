import java.util.Scanner;

public class Point {
  double x;
  double y;
  double z;

  Point(double x, double y) {
    this(x, y, 0.0);
  }

  Point(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  double distance(double x, double y) {
    double dx = this.x - x;
    double dy = this.y - y;
    return Math.sqrt((dx * dx) + (dy * dy));
  }

  double distance(double x, double y, double z) {
    double dx = this.x - x;
    double dy = this.y - y;
    double dz = this.z - z;
    return Math.sqrt((dx * dx) + (dy * dy) + (dz * dz));
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Point p1 = new Point(in.nextDouble(), in.nextDouble());
    System.out.println(String.format("%.2f", p1.distance(in.nextDouble(), in.nextDouble())));

    Point p2 = new Point(in.nextDouble(), in.nextDouble());
    System.out.println(String.format("%.2f", p2.distance(in.nextDouble(), in.nextDouble(), in.nextDouble())));

    in.close();
  }
}

import java.util.Scanner;

class Max {
  public Max() {

  }

  private static final double EPSILON = 1e-9;

  public int comTwo(int a, int b) {
    return a > b ? a : b;
  }

  public int comThree(int a, int b, int c) {
    return a > b ? a > c ? a : c : b > c ? b : c;
  }

  // public double comTwo(double a, double b) {
  // return Math.abs(a - b) > EPSILON ? a : b;
  // }

  // public double comThree(double a, double b, double c) {
  // // if (Math.abs(a - b) > EPSILON)
  // // if (Math.abs(c - a) > EPSILON)
  // // return a;
  // // else if (Math.abs(b - c) > EPSILON)
  // // return b;
  // // else
  // // return c;

  // return Math.abs(a - b) > EPSILON ? Math.abs(c - a) > EPSILON ? a : c :
  // Math.abs(b - c) > EPSILON ? b : c;
  // }
}

public class TestMax {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b, c;
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();

    Max com1 = new Max();

    System.out.println("a 和 b 最大值：" + com1.comTwo(a, b));
    System.out.println("a和b和c最大值：" + com1.comThree(a, b, c));
    scanner.close();
  }
}

// import java.util.Scanner;

class Test {
  private static String name;
  static {
    name = "World";
    System.out.print(name);
  }

  public static void main(String[] args) {
    System.out.print("Hello");
    Test test = new Test();
  }
}

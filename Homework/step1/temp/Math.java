import java.util.Scanner;

public class Math {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    if (scanner.hasNext()) {
      int n1 = scanner.nextInt();
      char op = scanner.next().charAt(0);
      int n2 = scanner.nextInt();

      Calculator cal = new Calculator(n1, op, n2);
      cal.PrintCalNum();
    }
    scanner.close();
  }
}

class Calculator {
  int n1;
  char op;
  int n2;

  public Calculator(int n1, char op, int n2) {
    this.n1 = n1;
    this.op = op;
    this.n2 = n2;
  }

  public void PrintCalNum() {
    int tmp = 0;
    if (op == '+') {
      tmp = n1 + n2;
      System.out.println("" + n1 + op + n2 + "=" + tmp);
    } else if (op == '-') {
      tmp = n1 - n2;
      System.out.println("" + n1 + op + n2 + "=" + tmp);

    } else if (op == '*') {
      tmp = n1 * n2;
      System.out.println("" + n1 + op + n2 + "=" + tmp);

    } else if (op == '/') {
      if (n2 == 0) {
        System.out.println("" + n1 + op + n2 + ":除数不能为0");
        return;
      }
      tmp = n1 / n2;
      System.out.println("" + n1 + op + n2 + "=" + tmp);
    } else {
      System.out.println("" + n1 + op + n2 + ":无效运算符" + op);
    }

  }
}

import java.util.Scanner;

//补齐Calculator类中的所有方法（实现成员变量result与参数的加减乘运算），通过构造方法初始化result。
class Calculator {
  double result;

  public Calculator(double res) {
    // this.result = res;
  }

  public Calculator() {
    this(0.0);
  }

  public Calculator add(double res) {
    result += res;
    return this;
  }

  public Calculator multiply(double res) {
    result *= res;
    return this;
  }

  public Calculator subtract(double res) {
    result -= res;
    return this;
  }

  public double getResult() {
    return this.result;
  }
}

public class TestCalculate {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Calculator calc = new Calculator(in.nextDouble());
    // 链式调用
    double result = calc.add(in.nextDouble()).multiply(in.nextDouble()).subtract(in.nextDouble()).getResult();

    System.out.println("计算结果: " + result);
  }
}

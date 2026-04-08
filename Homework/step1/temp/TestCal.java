public class TestCal {

  // 重载1：对整个 int 数组求和
  public static int sum(int[] arr) {
    int total = 0;
    for (int num : arr) {
      total += num;
    }
    return total;
  }

  // 重载2：对整个 double 数组求和
  public static double sum(double[] arr) {
    double total = 0.0;
    for (double num : arr) {
      total += num;
    }
    return total;
  }

  // 重载3：对 int 数组指定范围求和 [from, to)
  public static int sum(int[] arr, int from, int to) {
    int total = 0;
    // 题目要求是左闭右开 [from, to)，所以循环条件严格使用 i < to
    for (int i = from; i < to; i++) {
      total += arr[i];
    }
    return total;
  }

  // 重载1：对整个 int 数组求平均值
  public static double average(int[] arr) {
    if (arr.length == 0)
      return 0.0;
    return (double) sum(arr) / arr.length;
  }

  // 重载2：对整个 double 数组求平均值
  public static double average(double[] arr) {
    if (arr.length == 0)
      return 0.0;

    return sum(arr) / arr.length;
  }

  public static void main(String[] args) {
    int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    double[] dblArr = { 1.5, 2.5, 3.5, 4.5, 5.5 };

    System.out.println("=== int 数组 ===");
    System.out.println("全部求和: " + sum(intArr));
    System.out.println("索引[2,6)求和: " + sum(intArr, 2, 6)); // 3+4+5+6=18
    System.out.println("平均值: " + average(intArr));

    System.out.println("\n=== double 数组 ===");
    System.out.println("全部求和: " + sum(dblArr));
    System.out.println("平均值: " + average(dblArr));
  }
}

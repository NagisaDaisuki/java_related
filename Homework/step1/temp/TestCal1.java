public class TestCal {

  // 重载1：对整个 int 数组求和
  public static int sum(int[] arr) {
    int summ = 0;
    for (int val : arr) {
      summ += val;
    }
    return summ;
  }

  // 重载2：对整个 double 数组求和
  public static double sum(double[] arr) {
    double summ = 0.0;
    for (double val : arr) {
      summ += val;
    }
    return summ;
  }

  // 重载3：对 int 数组指定范围求和 [from, to)
  public static int sum(int[] arr, int from, int to) {
    int summ = 0;
    for (int i = from; i < to; i++) {
      summ += arr[i];
    }
    return summ;
  }

  // 重载1：对整个 int 数组求平均值
  public static int average(int[] arr) {
    int avg = 0;
    return (double) sum(arr) / arr.length;
  }

  // 重载2：对整个 double 数组求平均值
  public static double average(double[] arr) {
    double avg = 0.0;
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

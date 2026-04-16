import java.util.Scanner;

class Count_Char {
  static void count_char(String str) {
    int upper = 0,
        lower = 0,
        other = 0;

    // 遍历：str.toCharArray() 把字符串变成字符数组
    for (char ch : str.toCharArray()) {
      // 判断：使用 java 自带的 Character 工具类
      if (Character.isUpperCase(ch)) {
        upper++;
      } else if (Character.isLowerCase(ch)) {
        lower++;
      } else {
        other++;
      }
    }

    System.out.println(upper);
    System.out.println(lower);
    System.out.println(other);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    if (in.hasNext()) {
      String str = new String(in.nextLine());
      // System.out.println(str);
      count_char(str);
    }

    in.close();
  }
}

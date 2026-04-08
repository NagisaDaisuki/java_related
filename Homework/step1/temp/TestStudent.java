import java.util.Scanner;

public class TestStudent {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // int no = scanner.nextInt();
    // String name = scanner.next();
    // int score = scanner.nextInt();

    // Student s = new Student();
    // s.No = no;
    // s.Name = name;
    // s.Score = score;

    if (scanner.hasNext()) {
      int id = scanner.nextInt();
      String name = scanner.next();
      int score = scanner.nextInt();

      // 创建一个Student 对象
      Student student = new Student(id, name, score);

      System.out.println(student.name + ":" + student.getGrade());
    }

    scanner.close();
  }
}

class Student {
  // 成员变量
  int id;
  String name;
  int score;

  // 构造函数
  public Student(int id, String name, int score) {
    this.id = id;
    this.name = name;
    this.score = score;
  }

  // 成员函数
  public char getGrade() {
    if (score >= 90 && score <= 100) {
      return 'A';
    } else if (score >= 70 && score < 90) {
      return 'B';
    } else if (score >= 60 && score < 70) {
      return 'C';
    } else {
      return 'D';
    }
  }
}

import java.util.Scanner;

class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 0)
      this.age = age;
  }
}

class Student extends Person {
  private int score;

  public Student(String name, int age, int score) {
    super(name, age);
    this.score = score;
    System.out.println("Student 构造方法被调用");
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    if (score >= 0 && score <= 100)
      this.score = score;
  }
}

public class TestStudent {
  public static void main(String[] args) {
    Student stu = new Student("张三", 20, 95);
    System.out.println("姓名：" + stu.getName());
    System.out.println("年龄：" + stu.getAge());
    System.out.println("成绩：" + stu.getScore());
    stu.setScore(98);
    System.out.println("修改后成绩：" + stu.getScore());
  }
}

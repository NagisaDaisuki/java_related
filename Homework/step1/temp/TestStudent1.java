class Student {
  String name;
  int age;

  public Student() {
    this("Unknown");
  }

  public Student(String name) {
    this(name, 0);
    // this.name = name;
    // this.age = 0;
  }

  public Student(String name, int age) {
    // this(name, age);
    this.name = name;
    this.age = age;
  }
}

public class TestStudent1 {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Alice");
    Student s3 = new Student("Bob", 20);

    System.out.println("name=" + s1.name + ",age=" + s1.age); // name='Unknown', age=0
    System.out.println("name=" + s2.name + ",age=" + s2.age); // name='Alice', age=0
    System.out.println("name=" + s3.name + ",age=" + s3.age); // name='Bob', age=20
  }
}

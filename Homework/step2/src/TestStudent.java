import java.util.Scanner;

public class TestStudent {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Student.sId = in.nextInt();
    Student s1 = new Student(in.next(), in.nextInt());
    s1.set_score(in.nextInt(), in.nextInt(), in.nextInt());
    s1.set_ave();
    s1.print();
    in.close();
  }
}

class Student {
  public static int sId = 0;
  private int id;
  private String name;
  private int age;
  private int english;
  private int dataStruct;
  private int OOP;
  private int ave;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    sId++;
    id = sId;
  }

  public void set_score(int english, int dataStruct, int OOP) {
    this.english = english;
    this.dataStruct = dataStruct;
    this.OOP = OOP;
  }

  public void set_ave() {
    this.ave = (english + dataStruct + OOP) / 3;
  }

  public boolean ifValue(int judge) {
    if (judge < 0 || judge > 100)
      return false;
    return true;
  }

  public void print() {
    if (ifValue(english) && ifValue(dataStruct) && ifValue(OOP))
      System.out.printf("id:%d,name:%s,average:%d%n", id, name, ave);
    else
      System.out.println("error!");
  }
}

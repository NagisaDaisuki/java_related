class Father {
  public void f1() {
    f2();
  }

  public void f2() {
    System.out.println("调用父类的f2()");
  }
}

class Child extends Father {
  public void f1(int i) {
    System.out.println("调用子类的f1(),i=" + i);
  }

  public void f2() {
    System.out.println("调用子类的f2()");
  }
}

public class TestPolymorphism3 {
  public static void main(String[] args) {
    Father c = new Child();
    if (c instanceof Child) {
      Child newc = (Child) c; // 向下转型
      newc.f1(5);
      newc.f1();
    }
  }
}

class S {
  void print() {
    System.out.println("class S");
  }
}

class R extends S {
  void print() {
    System.out.println("class R");
  }
}

class C extends S {
  void print() {
    System.out.println("class C");
  }
}

class T extends S {
  void print() {
    System.out.println("class T");
  }
}

public class TestPolymorphism4 {
  // 在这里定义方法method1()，使得main()的三次方法调用分别绑定R,C,T中的重写方法
  public static void method1(S c) {
    c.print();
  }

  public static void main(String[] args) {
    R r = new R();
    C c = new C();
    T t = new T();
    method1(r);
    method1(c);
    method1(t);
  }

}

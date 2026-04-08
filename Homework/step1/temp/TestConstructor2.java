//改进代码，主类负责对象的创建，协调各模块的执行
public class TestConstructor2 {
  private int id;
  private String name;
  private String gender;

  public TestConstructor2(int id, String name, String gender) {
    this.id = id;
    this.name = name;
    this.gender = gender;
  }

  public static void main(String[] args) {
    TestConstructor2 t1 = new TestConstructor2(1, "张三", "男");
    TestConstructor2 t2 = new TestConstructor2(2, "李四", "女");
    System.out.println(t1.id + t1.name + t1.gender);
    System.out.println(t2.id + t2.name + t2.gender);
  }
}

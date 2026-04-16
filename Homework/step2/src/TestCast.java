// package week6.test;
public class TestCast {
  public static void main(String[] args) {
    Animal animal = new Dog("小黑", 3, "拉布拉多");
    System.out.println("名称：" + animal.getName());
    System.out.println("年龄：" + animal.getAge());

    // 请问此处animal如何安全访问breed,bark()?

    // 1. 使用 instanceof 判断 animal 实际指向的对象是不是 Dog 类型
    if (animal instanceof Dog) {
      // 2. 确认是 Dog 后，进行强制类型转换 (向下转型)
      Dog realDog = (Dog) animal;

      // 3. 现在可以通过 realDog 这个 引用去访问子类特有的字段和方法了
      System.out.println("品种：" + realDog.breed);
      realDog.bark();

    } else {
      System.out.println("这个动物不是狗，不能调用狗的方法和字段！");
    }
  }
}

class Animal {
  private String name;
  protected int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Animal 构造方法被调用");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

class Dog extends Animal {
  public String breed; // 子类新增成员

  public Dog(String name, int age, String breed) {
    super(name, age);
    this.breed = breed;
    System.out.println("Dog 构造方法被调用");
  }

  public String getBreed() {
    return breed;
  }

  public void bark() {
    System.out.println("汪汪！我是" + breed + "品种的狗");
  }
}

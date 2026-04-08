class Animal {
  public Animal(String name) {
    System.out.println("Animal构造：" + name);
  }

  // explicitly create a non-value construct function
  public Animal() {

  }
}

class Dog extends Animal {
  public Dog(String name) {
    System.out.println("Dog构造：" + name);
  }
}

public class TestAnimal {
  public static void main(String[] args) {
    Dog d = new Dog("旺财");
  }
}

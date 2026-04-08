// Class Person{ // Syntax error
class Person {
  void say() {
    System.out.println("hello");
  }
}

class Example {
  public static void main(String[] args) {
    Person p2 = new Person();
    Person p1 = new Person();
    p2.say();
    p1.say();
    p2 = null;
    p2.say(); // null pointer access
  }
}

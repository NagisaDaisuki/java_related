import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

class Product {
  private String code;
  private String name;
  private double price;
  // static int index = 1;

  public Product(String code, String name, double price) {
    if (price < 0)
      throw new IllegalArgumentException("价格不能为空");
    this.code = code;
    this.name = name;
    this.price = price;
  }

  public Product() {
    this("null", "null", 0.0);
  }

  @Override // 向上转型
  public boolean equals(Object o) {
    // 1. 如果自己跟自己比（内存地址一样），肯定相等
    if (this == o)
      return true;

    // 2. 如果对方是空的，或者根本不是一个类，直接返回 false
    if (o == null || getClass() != o.getClass())
      return false;

    // 3. 把对方强制转为 Product 类型
    // 向下转型
    Product product = (Product) o;

    // 4. 业务逻辑 仅仅比较 code 是否相等
    return Objects.equals(this.code, product.code);
  }

  @Override
  public int hashCode() {
    // 因为 equals 只比较了 code， 所以 hashCode 也只用 code 来生成
    return Objects.hash(code);
  }

  public void display(int index) {
    System.out.printf("商品%d -> 编号: %s, 名称: %s, 价格: %.2f%n", index, code, name, price);
    index++;
  }

}

class Goods_Comparsion {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    if (in.hasNext()) {
      // Product[] product = new Product[10];
      // product[0] = new Product(in.nextLine(), in.nextLine(), in.nextDouble());
      // product[1] = new Product(in.nextLine(), in.nextLine(), in.nextDouble());
      ArrayList<Product> list = new ArrayList<>();
      list.add(new Product(in.next(), in.next(), in.nextDouble()));
      list.add(new Product(in.next(), in.next(), in.nextDouble()));

      System.out.println("商品信息\n");
      // for (Product o : list) {
      // o.display(1);
      // }
      for (int i = 0; i < list.size(); i++) {
        list.get(i).display(i + 1);
      }
      System.out.println("\n相等性判断（仅按编号）\n");

      System.out.println("equals: " + list.get(0).equals(list.get(1)));
      System.out.println("hashCode相同: " + (list.get(0).hashCode() == list.get(1).hashCode()));

    }
    in.close();
  }
}

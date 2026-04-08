class Rectangle {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return length * width;
  }

  public double getPerimeter() {
    return 2 * (length + width);
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

}

public class TestRectangle {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(5, 3);
    System.out.println(rect.getLength() * rect.getWidth());
    System.out.println("面积：" + rect.getArea());
    System.out.println("周长：" + rect.getPerimeter());
    rect.setLength(10);
    rect.setWidth(5);
    System.out.println("新面积：" + rect.getArea());
  }
}

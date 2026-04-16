public class Main {
    public static void main(String[] args) {

    }
}

abstract class Shape{
    abstract double getArea();
}

class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    // 重写 getArea
    double getArea(){
        return Math.PI * r * r;
    }
}
class Rectangle extends Shape{
    // 重写 getArea
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    double getArea(){
        return length * width;
    }
}

class Triangle extends Shape{
    private double len1;
    private double len2;
    private double len3;

    public Triangle(double len1,double len2,double len3){
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
    }
    // 重写 getArea

    public boolean if_Triangle(){
        if (len1 + len2 > len3 && len1 + len3 > len2 && len2 + len3 > len1)
        {
            return true;
        }
        return false;
    }
    double getArea(){
        if (!if_Triangle){
            return 0.0;
        }
        return 0.0;
    }
}

class Ladder extends Shape{
    // 重写 getArea
    double getArea(){

    }
}

class TestShape extends Shape{
    private double area;

    static void totalArea(Shape s){
        area += s.getArea();
    }

    double getArea(){
        return area;
    }
}

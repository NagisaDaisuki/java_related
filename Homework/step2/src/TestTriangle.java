import java.util.Scanner;

class Triangle{
	private double a;
	private double b;
	private double c;
    void set(double a,double b,double c){
		if(a+b>c&b+c>a&a+c>b){
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else 
			System.out.println("error!");
	}
  
  @Override
  public String toString(){
    return "Triangle [a=" + a + ",b=" + b + ",c" + c + "" + "周长为:" + c() + "]";
  }
    double c() {
    	return a+b+c;
    }
}
public class TestTriangle {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
	    Scanner in = new Scanner(System.in);
		t1.set(in.nextDouble(), in.nextDouble(), in.nextDouble());	
		System.out.println(t1);
	}
}

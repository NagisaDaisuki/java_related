public class Complex {
	double real, imag;
	Complex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	Complex add(Complex a, Complex b) {
		this.real = a.real + b.real;
		this.imag = a.imag + b.imag;
		return this;
	}
	Complex subtract(Complex a, Complex b) {
		this.real = a.real - b.real;
		this.imag = a.imag - b.imag;
		return this;
	}

  public String toString(){
    return "real" + " : " + (int)real + " imag" + " : " + (int)imag;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c0 = new Complex(0, 0);
		Complex c1 = new Complex(6, 4);
		Complex c2 = new Complex(2, 3);
		System.out.println(c0.add(c1, c2));
		System.out.println(c0.subtract(c1, c2));
	}
}

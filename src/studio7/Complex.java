package studio7;

public class Complex {

	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public String toString() {
		return real+"+"+imaginary+"i";
	}
	
	
	public Complex add(Complex other) {
		return new Complex(this.real+other.real, this.imaginary+other.imaginary);
	}
	
	public Complex multiply(Complex other) {
		return new Complex((this.real*other.real) - (this.imaginary*other.imaginary), (this.real*other.imaginary) + (this.imaginary*other.real));
	}

}

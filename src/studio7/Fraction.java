package studio7;

public class Fraction {

	private int numerator;
	private int denominator;


	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}


	public Fraction add(Fraction other) {
		int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
		int newDenominator = this.denominator * other.denominator;
		return new Fraction(newNumerator, newDenominator);

	}
	public Fraction multiply(Fraction other) {
		int newNumerator = this.numerator * other.numerator;
		int newDenominator = this.denominator * other.denominator;
		return new Fraction(newNumerator, newDenominator);
	}
	public Fraction reciprocal() {
		return new Fraction(this.denominator, this.numerator);
	}
	public Fraction simplify() {
		int gcd = gcd(this.numerator, this.denominator);
		return new Fraction(this.numerator/gcd, this.denominator/gcd);
	}

	public static int gcd(int p, int q) {
		if (p%q == 0) {
			return q;
		}
		else {
			return gcd(q,p%q);
		}
	}
}

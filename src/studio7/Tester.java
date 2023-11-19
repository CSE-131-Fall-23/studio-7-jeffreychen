package studio7;

public class Tester {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(2.0,2);
		Rectangle a1 = new Rectangle(3,7);
		System.out.println(a.area());
		System.out.println(a.ifSmaller(a1));
		
		Die b = new Die(5);
		System.out.println(b.Rolldie());
		System.out.println(b.Rolldie());
		System.out.println(b.Rolldie());
		
		Fraction c = new Fraction(6,15);
		System.out.println(c.simplify());
		
		Complex d = new Complex(6.2,4.4);
		Complex d1 = new Complex(3.5, 4.1);
		System.out.println(d.multiply(d1));
	}

}

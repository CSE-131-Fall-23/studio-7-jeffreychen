package studio7;

public class Rectangle {

	private double length;
	private double width;



	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	
	public double area() {
		return this.length * this.width;
	}

	public double perimeter() {
		return 2*(this.length + this.width);
	}

	public boolean ifSmaller(Rectangle other) {
		if (this.area()<other.area()) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean ifSquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}

}

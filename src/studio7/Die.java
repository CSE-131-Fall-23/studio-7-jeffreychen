package studio7;

public class Die {

	private int side;
	
	
	public Die(int side) {
		this.side = side;
	}
	public int getside() {
		return this.side;
	}
	public String toString() {
		return "The die has "+this.side+" sides";
	}
	
	
	public int Rolldie() {
		return (int)(Math.random()*this.side+1);
	}
}

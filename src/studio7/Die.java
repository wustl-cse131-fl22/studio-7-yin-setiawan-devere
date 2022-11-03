package studio7;

public class Die {
	
	private int sides;
	
	public Die() {
		this.sides = 6;
	}
	public Die(int intSides) {
		this.sides = intSides;
	}
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	public int rollDie () {
		int rand = (int)(Math.random()*(this.sides)+1);
		return rand;
	}	
	public static void main (String[]args) {
		Die myDie = new Die (10); 
		System.out.println(myDie.rollDie());
		myDie.setSides(20);
		System.out.println(myDie.getSides());
		System.out.println(myDie.rollDie());
	}
}

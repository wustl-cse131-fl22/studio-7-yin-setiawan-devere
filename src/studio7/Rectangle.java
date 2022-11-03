package studio7;

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(int L, int W) {
		this.length = L;
		this.width = W;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getPerimeter() {
		int perimeter = (2*length + 2*width);
		return perimeter;
	}
	public int getArea() {
		int area = (length*width);
		return area;
	}
	public boolean square () {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isGreaterThan(Rectangle otherRectangle) {
		if (this.getArea()>otherRectangle.getArea()){
			return true;
		}
		else {
			return false;
		}
		
	}
	public void main (String[]args) {
		Rectangle myRectangle = new Rectangle (2,3);
		Rectangle smallRectangle = new Rectangle (1,1);
		System.out.println(myRectangle.getPerimeter());
		System.out.println(myRectangle.getArea());
		System.out.println(myRectangle.isGreaterThan(smallRectangle));
	}
}


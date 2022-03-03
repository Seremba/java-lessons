package inheritance;

public class Rectangle {
    protected double width;
	protected double length;
	protected double sides = 4;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getSides() {
		return sides;
	}

	public void setSides(double sides) {
		this.sides = sides;
	}

	public double calculatePerimeter(){
		return (2 * width) + (2 * length);
	}
}

package abstraction;

public class ShapeTester {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(7, 5);
		rectangle.print();
		double ans = rectangle.calculateArea();
		System.out.println(ans);
	}
}

package classesAndobjects;

import java.util.Scanner;
/*
Objects as method parameters, and return types
 */
// create a class that creates instances of rectangle to calculate the area of a rectangle
public class HomeAreaCalculatorRedo {

	public static void main(String[] args) {
		HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
		Rectangle bathroom = calculator.getRoom();
		Rectangle kitchen = calculator.getRoom();

		double area = calculateTotalArea(bathroom, kitchen);

		System.out.println("The total area is "+area);

	}

	public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {

			return rectangle1.calculateArea() + rectangle2.calculateArea();
	}

	public Rectangle getRoom(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter room length: ");
		double length = scanner.nextDouble();

		System.out.println("Enter room width: ");

		double width = scanner.nextDouble();


		return new Rectangle(length, width);
	}
}

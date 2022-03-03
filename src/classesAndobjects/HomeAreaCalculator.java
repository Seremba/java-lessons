package classesAndobjects;
// create a class that creates instances of rectangle to calculate the area of a rectangle
public class HomeAreaCalculator {

	public static void main(String[] args) {
		/****************
		 * RECTANGLE 1
		 ****************/
		// calculate the area of a rectangular room 1

		Rectangle room1 = new Rectangle();
		room1.setWidth(25);
		room1.setLength(20);

		double areaOfRoom1 = room1.calculateArea();

		/****************
		 * RECTANGLE 2
		 ****************/
		// calculate the area of a rectangular room 2
		Rectangle room2 = new Rectangle(50,100);
		double areaOfRoom2 = room2.calculateArea();

		double totalArea = areaOfRoom1 + areaOfRoom2;

		System.out.println("The total area of all rooms: "+ totalArea);
	}

	// create a class that creates instances of rectangle to calculate the area of a rectangle
	public static class HomeAreaCalculatorRedo {

		public static void main(String[] args) {
			/****************
			 * RECTANGLE 1
			 ****************/
			// calculate the area of a rectangular room 1

			Rectangle room1 = new Rectangle();
			room1.setWidth(25);
			room1.setLength(20);

			double areaOfRoom1 = room1.calculateArea();

			/****************
			 * RECTANGLE 2
			 ****************/
			// calculate the area of a rectangular room 2
			Rectangle room2 = new Rectangle(50,100);
			double areaOfRoom2 = room2.calculateArea();

			double totalArea = areaOfRoom1 + areaOfRoom2;

			System.out.println("The total area of all rooms: "+ totalArea);
		}
	}
}

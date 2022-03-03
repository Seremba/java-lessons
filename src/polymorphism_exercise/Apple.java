package polymorphism_exercise;

public class Apple extends  Fruit{


	public Apple(String calories) {
		super(calories);
	}

	@Override
	public void makeJuice(){
		System.out.println(" Apple Juice is made");
	}
	public void removeSeeds(){
		System.out.println("seeds have been removed");
	}
}

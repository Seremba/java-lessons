package polymorphism_exercise;

public class Banana extends Fruit{

	public Banana(String calories) {
		super(calories);
	}

	@Override
	public void makeJuice(){
		System.out.println(" Banana Juice is made");
	}

	public void peel(){
		System.out.println("Start peeling bananas");
	}

}

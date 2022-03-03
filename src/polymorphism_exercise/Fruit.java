package polymorphism_exercise;

public class Fruit {

	protected String calories;

	public Fruit() {

	}

	public Fruit(String calories) {
		this.calories = calories;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	public void makeJuice(){
		System.out.println("Juice is made");
	}
}

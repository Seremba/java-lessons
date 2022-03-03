package polymorphism_exercise;

public class Market {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		fruit.makeJuice();
		Fruit apple = new Apple("seven");
		((Apple) apple).removeSeeds();
		squueze(apple);
		System.out.println();
		Fruit banana = new Banana("not so sure");
		banana.makeJuice();
		((Banana) banana).peel();
		squueze(banana);
	}

	public static void squueze(Fruit fruit){
		if(fruit instanceof Apple ){
			System.out.println("Jane squeeze the apple juice");
		} else if(fruit instanceof Banana){
			System.out.println("Sarah squeeze the banana");
		}
	}
}

package polymorphism;

public class Cat extends  Animal{

	@Override
	public void makeSound(){
		System.out.println("meau");
	}
	public void scratch(){
		System.out.println("I am a cat I scratch things");
	}
}

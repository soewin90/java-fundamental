package AbstractAndInterface;

public class Cat extends Animal implements AnimalStuff {

	@Override
	void print() {
		System.out.println("This is cat");
	}

	@Override
	public void eat() {
		System.out.println("Much Much Much");

	}

	@Override
	public void sleep() {
		System.out.println("Zzzz...");

	}

	@Override
	public void walk() {
		System.out.println("Walking...");

	}

}

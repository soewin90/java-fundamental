package AbstractAndInterface;

public abstract class Animal {

	int age;
	String name;

	public abstract void eat();

	public abstract void walk();

	void print() {
		System.out.println("I am animal");
	}

}

package super_sample;

public class Animal {

	public String name;
	public int age;

	public Animal() {
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void makeNoise() {
		System.out.println("Animal making noise");
	}

	public void eat() {
		System.out.println("much much much");
	}

	public void somethingPrivate() {
		System.out.println("Something Private");
	}

}

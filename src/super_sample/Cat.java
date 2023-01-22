package super_sample;

public class Cat extends Animal {

	public String catFood;

	public Cat() {
		super();
	}

	public Cat(String name, int age, String catFood) {
		super(name, age);
		this.catFood = catFood;
	}

	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("meow meow meow");
		eat();
		super.somethingPrivate();
	}

}

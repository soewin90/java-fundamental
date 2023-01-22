package super_sample;

public class SuperMain {

	public static void main(String args[]) {
		Cat cat = new Cat("Backy", 5, "Fish");
		cat.makeNoise();
		System.out.println(cat.name + " " + cat.age + " " + cat.catFood);

	}

}


public class ImmutableStringMain {

	public static void main(String args[]) {

		String name = "John";

		String anotherName = "John";

		System.out.println(name == anotherName);

		anotherName = "Carl";

		System.out.println(name == anotherName);

		String thridName = new String("John");
		System.out.println(name == thridName);

		String myName = "gautam";

		addMoneyToAccount(myName, 500);

	}

	static void addMoneyToAccount(String accountName, int amout) {

	}

}

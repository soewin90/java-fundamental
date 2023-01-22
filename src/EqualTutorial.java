
public class EqualTutorial {

	public static void main(String args[]) {

		Employee e1 = new Employee(1, "John");
		Employee e2 = e1;
		if (e1 == e2) {
			System.out.println("employe object memory location are equal name");
		}

		String name = new String("John"); // mem loc 122
		String anotherName = new String("John"); // mem loc 123
		if (name == anotherName) {
			System.out.println("they are equal name");
		} else {
			System.out.println("thye are not equal name");
		}

		if (name.equals(anotherName)) {
			System.out.println("they are equal name using equal method");
		}

		String n1 = "John";
		String n2 = n1;
		n2 = "Carl";
		if (n1 == n2) {
			System.out.println("they are equal name using ==");
		}

		int i = 3;
		int j = 3;

		if (i == j) {
			System.out.println("they are equal literal");
		}

	}

}

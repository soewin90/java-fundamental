import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Kumar"); // memory location: #123
		Employee e2 = new Employee(2, "Kumar"); // memory location: #124
		System.out.println("Shallow Equal: " + (e1 == e2));
		System.out.println("Deep Equal: " + (e1.equals(e2)));

		Set<Employee> empSet = new HashSet<>();
		empSet.add(e1);
		empSet.add(e2);
		Iterator<Employee> itr = empSet.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e.id + " : " + e.name);
		}
	}

}

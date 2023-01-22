package generic_sample;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {

//		PrintGeneric<Integer> printGeneric = new PrintGeneric<>(5);
//		printGeneric.print();
//
//		PrintGeneric<Double> printGenericeDouble = new PrintGeneric<>(5.09);
//		printGenericeDouble.print();
//
//		PrintGeneric<Object> objGeneic = new PrintGeneric<>(4);
//		objGeneic.print();

//		PrintGeneric<Cat, Cat> catGeneric = new PrintGeneric<>(new Cat(), new Cat());
//		catGeneric.print();

//		print(3, "asdf");
//		print(3.0, 3);
//		print("Hello", "MyanmarFullStackDeveloper");
//		print(new Animal(), new Cat());

		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		printList(intList);

		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat());
		printList(catList);

		List<String> strList = new ArrayList<>();
		strList.add("Hello");
		printList(strList);
	}

	private static void printList(List<?> myList) {
		System.out.println(myList);
	}

	public static <T, V> T print(T thingToPrint, V thingToShout) {
		System.out.println("Printing Generice Method thingToPrint: " + thingToPrint);
		System.out.println("Printing Generice Method thingToShout: " + thingToShout);
		return thingToPrint;
	}

}

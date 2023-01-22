package CheckedUncheckException;

import java.util.Objects;

public class CheckedUncheckedExceptionMain {

	public static void main(String args[]) {

		String name = null;

		printName(name);

	}

	public static void printName(String name) {
		if (Objects.nonNull(name)) {
			System.out.println(name.length());
		}
		throw new RuntimeException();

	}

}

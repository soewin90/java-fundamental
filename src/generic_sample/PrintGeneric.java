package generic_sample;

import java.io.Serializable;

public class PrintGeneric<T, V extends Animal & Cloneable & Serializable> {

	T thingToPrint;
	V thingToPrintV;

	public PrintGeneric(T thingToPrint, V thingToPrintV) {
		this.thingToPrint = thingToPrint;
		this.thingToPrintV = thingToPrintV;
	}

	public void print() {
		((Animal) this.thingToPrint).print();
		this.thingToPrintV.print();
	}

}

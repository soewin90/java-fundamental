package generic_sample;

public class PrintInteger {

	Integer thingToPrint;

	public PrintInteger(Integer thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println("Print " + this.thingToPrint);
	}

}

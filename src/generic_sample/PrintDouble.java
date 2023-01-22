package generic_sample;

public class PrintDouble {

	Double thingToPrint;

	public PrintDouble(Double thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println("Print " + this.thingToPrint);
	}

}

package generic_sample;

public class PrintString {

	String thingToPrint;

	public PrintString(String thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println("Print " + this.thingToPrint);
	}

}

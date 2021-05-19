package BuillderPattern;

public class Phone {

	private String os;
	private int ram;
	private float screenSize;
	private String battery;
	
	
	
	
	public Phone(String os, int ram, float screenSize, String battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.screenSize = screenSize;
		this.battery = battery;
	}




	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", screenSize=" + screenSize + ", battery=" + battery + "]";
	}
	
	
	
}

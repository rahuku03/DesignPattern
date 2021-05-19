package BuillderPattern;

public class PhoneBuilder {
	
	
	private String os;
	private int ram;
	private float screenSize;
	private String battery;
	
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreenSize(float screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, ram, screenSize, battery);
	}
	
	
	
}

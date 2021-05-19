package AbstractFactory;

public class Laptop implements Computer {

	private String ram;
	private String os;
	
	
	
	public Laptop(String ram, String os) {
		this.ram = ram;
		this.os = os;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getOs() {
		// TODO Auto-generated method stub
		return this.os;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", os=" + os + "]";
	}

}

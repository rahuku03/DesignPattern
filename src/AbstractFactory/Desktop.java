package AbstractFactory;

public class Desktop implements Computer {

	private String ram;
	private String os;
	
	
	
	public Desktop(String ram, String os) {
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
		return "Desktop [ram=" + ram + ", os=" + os + "]";
	}

}

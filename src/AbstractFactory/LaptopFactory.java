package AbstractFactory;

public class LaptopFactory implements AbstractFactory {

	private String ram;
	private String os;
	
	
	
	public LaptopFactory(String ram, String os) {
	
		this.ram = ram;
		this.os = os;
	}

	
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Laptop(ram, os);
	}
}

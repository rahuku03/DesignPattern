package AbstractFactory;

public class DesktopFactory implements AbstractFactory{

	private String ram;
	private String os;
	
	
	
	public DesktopFactory(String ram, String os) {
	
		this.ram = ram;
		this.os = os;
	}



	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Desktop(ram, os);
	}
}

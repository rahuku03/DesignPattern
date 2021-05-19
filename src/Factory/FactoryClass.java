package Factory;


public class FactoryClass {

	
	private FactoryClass() {
		
	}
	
	public static Computer getComputer(ComputerEnum type,String os,String ram) {
		
		switch(type) {
		case Laptop:
			return new Laptop(ram,os);
			
		case Desktop:
		    return new Desktop(ram,os);
		    
		default:
			throw new RuntimeException("Invalid Selection !!!");
		}
	}
	
	
}

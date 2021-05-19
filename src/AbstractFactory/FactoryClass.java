package AbstractFactory;



public class FactoryClass {

	
	private FactoryClass() {
		
	}
	
	
	public static Computer getComputer(AbstractFactory factory) {
		return factory.createComputer();
		
	}
}

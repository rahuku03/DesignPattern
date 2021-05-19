package AbstractFactory;



public class Driver {
public static void main(String[] args) {
	
	Computer computer=FactoryClass.getComputer( new DesktopFactory("windows", "16GB"));
	System.out.println(computer);
	
	Computer computer1=FactoryClass.getComputer(new LaptopFactory("MAC", "32GB"));
	System.out.println(computer1);
	
	
}
}

package Factory;



public class Driver {
public static void main(String[] args) {
	
	Computer computer=FactoryClass.getComputer(ComputerEnum.Laptop, "windows", "16GB");
	System.out.println(computer);
	
	Computer computer1=FactoryClass.getComputer(ComputerEnum.Desktop, "MAC", "32GB");
	System.out.println(computer1);
	
	
}
}

package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable{
	
	private static List<String> test=null;

	static{
		test=new ArrayList<String>();
		test.add("Rahul");
		test.add("Amit");
		test.add("Sumith");
		test.add("Praveen");
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}


	public static List<String> getTest() {
		return test;
	}


	public static void setTest(List<String> test) {
		Prototype.test = test;
	}
	
	
}

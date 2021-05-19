package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype p=new Prototype();
		System.out.println(p.getTest());
		
		Prototype p1=(Prototype)p.clone();
		List t=p1.getTest();
		t.add("sdfsdf");
		System.out.println(p1.getTest());
	}

}

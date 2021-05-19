package SingletonPattern;

import java.io.Serializable;



public class SingletonWithSerialization implements Serializable {
	
	private static final long serialVersionUID = 4L;
	
	
	private static SingletonWithSerialization singleton=new SingletonWithSerialization();
	
	private SingletonWithSerialization() {
		
	}
	
	public SingletonWithSerialization getInstance() {
		return singleton;
	}
	
	
	private Object readResolve() {
		  return singleton;
	}
	
}

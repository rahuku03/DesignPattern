package SingletonPattern;

public class SingletonCloning implements Cloneable{

	private static SingletonCloning singleton=new SingletonCloning();
	
	private SingletonCloning() {
		
	}
	
	public SingletonCloning getInstance() {
		return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("SingletonCloning Class does Not support cloning");
	}
	
	
}


//Notes - Inbuilt Singleton classes are Runtime,Desktop etc.
package SingletonPattern;



public class SingletonEager {

	private static SingletonEager singleInstance=new SingletonEager();
	
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getInstance() {
		
			return singleInstance;

	}
	
}

package SingletonPattern;

public class SingletonLazy {

    private static SingletonLazy singleInstance;
	
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getInstance() {
		
		if(singleInstance==null) {
			singleInstance=new SingletonLazy();
			return singleInstance;
		}else {
		return singleInstance;
		}

}

}

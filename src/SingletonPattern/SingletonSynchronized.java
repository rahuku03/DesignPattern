package SingletonPattern;

public class SingletonSynchronized {

	
	
	 private static SingletonSynchronized singleInstance;
		
		
		private SingletonSynchronized() {
			
		}
		
		
		//method synchronized
		public static synchronized SingletonSynchronized getInstance() {
			
			if(singleInstance==null) {
				singleInstance=new SingletonSynchronized();

			}
			return singleInstance;

	}
		
		//block synchronized
	public static synchronized SingletonSynchronized getInstanceBlock() {
			
			if(singleInstance==null) {
				synchronized (SingletonSynchronized.class) {
					if(singleInstance==null) {
						singleInstance=new SingletonSynchronized();
					
					}
				}
				
	
			}
			return singleInstance;
	}
		
}

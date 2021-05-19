package SingletonPattern;

public class BilPloughApproachSingleton {
	
	
	
	
	
	private BilPloughApproachSingleton() {
		
	}
	
	private static class SingletonHolder{
		
		private static final BilPloughApproachSingleton INSTANCE=new BilPloughApproachSingleton();
		
	}
		public static BilPloughApproachSingleton getInstance() {
			return SingletonHolder.INSTANCE;
		}
	

}

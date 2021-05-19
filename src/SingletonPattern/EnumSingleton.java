package SingletonPattern;


//Through reflection we can create multiple instances to avoid such cases we have the best way to create singleton 
//class using ENUM.
public enum EnumSingleton {

	GET_INSTANCE;
	
	public String welcome() {
		return "DO WHATEVER YOU WANT !!!";
	}
	
}

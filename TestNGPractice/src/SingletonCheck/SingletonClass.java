package SingletonCheck;

public class SingletonClass {
	
	//1. Private static variable -> the only instance of the class
	private static SingletonClass instance;
	
	//2. Private constructor which restrict the instantiation of the class
	private SingletonClass() {
		}
	
	//3. Public static method which returns the instance of the class (global access point for outer world)
	public static SingletonClass getinstance() {
		if(instance==null) {
			instance = new SingletonClass();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("SingletonClass is implemented");
	}
	

}

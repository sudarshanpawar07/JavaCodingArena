package ExceptionHandling;

public class SingletonDriver {

	public static void main(String[] args) {
			
		Singleton obj = new Singleton();
		System.out.println(obj.getInstance());
		
		Singleton obj1 = new Singleton();
		System.out.println(obj1.getInstance());

	}

}

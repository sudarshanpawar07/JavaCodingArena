package ExceptionHandling;

public class Singleton {

	private static Singleton obj;

	Singleton() {
		super();
	}

	public Singleton getInstance() {
		if (obj == null)
		obj = new Singleton();
		

		return obj;
	}

}

package ExceptionHandling;

public class ConstructorRecursion {
	 ConstructorRecursion obj;

	ConstructorRecursion() {
		obj = new ConstructorRecursion();
	}

	public static void main(String[] args) {
		new ConstructorRecursion();

	}

}

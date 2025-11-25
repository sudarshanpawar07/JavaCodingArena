package ExceptionHandling;

public class Scenario2 {

	public static void main(String[] args) {
		System.out.println("Starts");
		try {
			System.out.println("hello".charAt(6));
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("heloo");
		}

	}

}

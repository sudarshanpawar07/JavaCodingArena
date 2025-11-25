package ExceptionHandling;

public class Scenario5 {

	public static void main(String[] args) {

		try {
			System.out.println("Hello java");
			// Thread.sleep(2000); -> CTE
			System.out.println("Hello world");
		} catch (ArithmeticException e) {
			System.out.println("Exception handled.");
		}
	}

}

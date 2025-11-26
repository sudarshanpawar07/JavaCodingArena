package ExceptionHandling;

public class Scenario7 {
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			System.out.println("try");
			System.out.println(10 / 0);
		}
		// System.out.println("helooo"); -> CTE Break the association
		catch (ArithmeticException e) {
			System.out.println("Exception handled..");
		}
	}
}

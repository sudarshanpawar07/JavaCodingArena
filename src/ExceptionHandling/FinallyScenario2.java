package ExceptionHandling;

public class FinallyScenario2 {

	public static void main(String[] args) {
		System.out.println("main starts");

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(" try " + i);
			} catch (ArithmeticException ae) {
				System.out.println("catch : " + i);
			} finally {
				System.out.println("finally : " + i);
			}
		}
		System.out.println("main ends");
	}

}

package ExceptionHandling;

public class FinallyScenario7 {
	public static void main(String[] args) {
		System.out.println("main starts");

		try {
			System.out.println(" try ");
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("catch  ");
			for (;;) {

			}
		} finally {
			System.out.println("finally  ");
		}

		System.out.println("main ends");
	}

}

package ExceptionHandling;

public class Scenario8 {
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			System.out.println("Try");
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("Exception handled..");
			System.out.println(args[0]);
		}
		System.out.println("main ends.");
	}
}

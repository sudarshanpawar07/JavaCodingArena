package ExceptionHandling;

public class Scenario9 {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			System.out.println("try");
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("Catch 1");
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Catch 2");
		}
		System.out.println("main ends.");
	}

}

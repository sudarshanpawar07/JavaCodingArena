package ExceptionHandling;

public class ToStringOfThrowable {

	public static void main(String[] args) {
		System.out.println("main starts");

		try {
			System.out.println("try");
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			System.out.println(ae.toString());
			// it will give the description of Exception
		}
	}

}

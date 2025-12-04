package ExceptionHandling;

public class GetStackStraceExample {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			m1();

		} catch (ArithmeticException ae) {
			System.out.println("catch");
			StackTraceElement[] arr = ae.getStackTrace();
			for (StackTraceElement ele : arr) {
				System.out.println(ele);
			}
		}

	}

	public static void m1() {
		m2();
	}

	public static void m2() {
		System.out.println(10 / 0);
	}

}

package ExceptionHandling;

public class GetCauseExample {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			System.out.println("try main");
			m1();
		} catch (Exception e) {
			System.out.println("Catch main");
			System.out.println(e.getCause());
		}
		System.out.println("main ends");

	}

	public static void m1() {
		System.out.println("m1()starts");
		try {
			System.out.println("try m1");
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("catch m1() ");
			throw new RuntimeException("Something Went wrong", ae);
		}
	}

}

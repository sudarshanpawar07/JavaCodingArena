package ExceptionHandling;

public class FinallyScenario1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}

	public static void m1() {
		System.out.println("m1() starts");
		try {
			System.out.println("try block");
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("Catch exception");
			return;
		} finally {
			System.out.println("finally");
		}
		System.out.println("m1() ends");
	}

}

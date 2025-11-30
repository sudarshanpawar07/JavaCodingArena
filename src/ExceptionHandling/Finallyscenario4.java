package ExceptionHandling;

public class Finallyscenario4 {
	public static void main(String[] args) {
		System.out.println("main starts");

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(" try " + i);
				if(i % 2 == 0)System.out.println(10/0);
			} catch (ArithmeticException ae) {
				System.out.println("catch : " + i);
				break;
			} finally{
				System.out.println("finally : " + i);
				//continue;
			}
		}
		System.out.println("main ends");
	}

}

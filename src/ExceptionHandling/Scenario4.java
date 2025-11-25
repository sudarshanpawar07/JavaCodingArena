package ExceptionHandling;

public class Scenario4 {

	public static void main(String[] args) {

		try {
			System.out.println("Hello");
			Thread.sleep(2000);
			System.out.println("word");
		} catch (Throwable e) {
			System.out.println("Exception handled.");
		}

	}

}

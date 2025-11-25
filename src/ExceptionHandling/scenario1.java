package ExceptionHandling;

public class scenario1 {

	public static void main(String[] args) {
		System.out.println("Starts");
		try {
			System.out.println("Hello".charAt(6));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("heloo");
		}
		System.out.println("Ends");

	}

}

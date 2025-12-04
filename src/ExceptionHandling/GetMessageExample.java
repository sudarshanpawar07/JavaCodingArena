package ExceptionHandling;

public class GetMessageExample {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			int[] arr = { 10, 20, 30, 40 };
			arr[4] = 100;
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("main ends");
	}

}

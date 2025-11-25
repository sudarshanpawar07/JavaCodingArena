package ExceptionHandling;

public class UnchckedException {
	public static void main(String[] args) {
		String str = "Hello Java";
		for (int i = 0; i < str.length(); i++) {
			try {
				System.out.println(str.charAt(i));
			} catch (Exception e) {
				System.out.println("Exception handled..");
				System.out.println(e);
			}
		}
	}

}

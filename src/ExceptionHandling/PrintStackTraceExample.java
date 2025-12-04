package ExceptionHandling;

public class PrintStackTraceExample {

	public static void main(String[] args) {
		System.out.println("main starts.");
		try {
			System.out.println("try");
		//	String str = null;
			//str.charAt(0);
		} catch (NullPointerException npe) {
			System.out.println("catch.");
			npe.printStackTrace();
		}
		System.out.println("main ends.");
	}

}

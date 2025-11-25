package ExceptionHandling;

public class MyDataUsingThread {
	String str = "Sudarshan";

	public void ExceuteData() throws InterruptedException {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
			Thread.sleep(1000);
		}
	}

	public void reverseData() throws InterruptedException {
		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev =  str.charAt(i) + rev;
			
		}
			System.out.println("Reverse data : " + rev);
			
			for (int i = rev.length()-1; i >= 0 ; i--) {
				System.out.print(rev.charAt(i) + " ");
				Thread.sleep(1000);
			}
	}

}

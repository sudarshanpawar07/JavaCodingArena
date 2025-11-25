package ExceptionHandling;

public class MyDataUsingThreadDriver {

	public static void main(String[] args) throws InterruptedException {
		new MyDataUsingThread().ExceuteData();
		System.out.println();
		new MyDataUsingThread().reverseData();

	}

}

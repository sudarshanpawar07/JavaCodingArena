package ExceptionHandling;

public class PrintAToZ {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println();
		for(char i = 'A';i<='Z';i++)
		{
			System.out.print(i + " ");
			Thread.sleep(1000);
		
		}
		System.out.println();
	}

}

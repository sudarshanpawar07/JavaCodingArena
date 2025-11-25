package ExceptionHandling;

public class Scaenario3 {

	public static void main(String[] args) {
		try {
			System.out.println("Hello java");
			Thread.sleep(2000);
			System.out.println("Hello word");

		}
		catch(InterruptedException e)
		{
			System.out.println("IntterruptedException handled.");
		}
	}

}

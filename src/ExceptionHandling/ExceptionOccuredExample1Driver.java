package ExceptionHandling;

public class ExceptionOccuredExample1Driver {
	public static void main(String[] args) {
	try {
		new ExceptionOccuredExample1().m2();
	}
	catch(Exception e){
		System.out.println("Exception handled Sucessfully");
	}
	}

}

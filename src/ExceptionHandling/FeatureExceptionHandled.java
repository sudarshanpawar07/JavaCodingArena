package ExceptionHandling;

public class FeatureExceptionHandled {

	public void executeProgram() {
		int op = 0;
		try {
			 op = new Feature().division(10, 2);
		} catch (Exception e) {
			System.out.println("Exception handled...");
		}
		System.out.println("Output : " + op);

	}
}

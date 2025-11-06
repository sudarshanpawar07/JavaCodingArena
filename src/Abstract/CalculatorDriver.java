package Abstract;

public class CalculatorDriver {

	
	public static void main(String[] args) {
	
		Calculator c1 = new CalculatorImp();
	
		c1.division(10, 2);
		c1.multiplication(5, 2);
		c1.addition(5, 2);
		c1.subtraction(50, 20);

	}

}

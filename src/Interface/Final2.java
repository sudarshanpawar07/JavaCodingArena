package Interface;

public class Final2 {
	// final static int n ; -> CTE
	final static int n = 1234;
	
	final static int SUM_OF_DIGITS;
	static{
		int num = n;
		int sum = 0;
		while(num > 0)
		{
			int last = num % 10;
			sum += last;
			num/=10;
		}
		SUM_OF_DIGITS = sum;
	}

	public static void main(String[] args) {
		
		
		// local final variable
		
		final int A;
		 A = 10;
		 System.out.println(A);
		// A = 100; -> CTE 
		
		System.out.println(SUM_OF_DIGITS);
	}

}

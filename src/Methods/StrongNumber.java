package Methods;

public class StrongNumber {
	public static void main(String [] args)
	{
		if(strongNumber(145))
		{
			System.out.println("It is a Strong Number ");
		}
		else {
			System.out.println("It is not a Strong Number");
		}
		
	}
	public static boolean strongNumber(int num)
	{
		int temp = num;
		int sum = 0;
		while(num != 0)
		{
			int last = num % 10;
			sum += factorial(last);
			num /= 10;
		}
		return sum == temp;
	}
	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}

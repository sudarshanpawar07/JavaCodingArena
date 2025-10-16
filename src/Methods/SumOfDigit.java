package Methods;

public class SumOfDigit {
	public static void main(String [] args)
	{
		System.out.println("sum of Digit is : "+sumOfDigits(123));
	}
	
	public static int sumOfDigits(int num)
	{
		int sum = 0;
		while(num != 0)
		{
			sum += (num%10);
			
			num/=10;
		}
		return sum;
	}
}

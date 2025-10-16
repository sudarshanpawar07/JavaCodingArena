package Methods;

public class Prime {
	public static void main(String [] args)
	{
		if(isPrime(38))
		{
			System.out.println("It is a Prime");
		}
		else {
			System.out.println("It is not Prime");
		}
	}

	public static boolean isPrime (int num)
	{
		int den = 2;
		while(den <=  num /2)	
		{
			if(num % den == 0)
			{
				return false;
			}
			
			den++;
		}
		return true;
	}
}

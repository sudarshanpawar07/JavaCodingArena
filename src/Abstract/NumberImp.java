package Abstract;

public class NumberImp extends Number{
	
	public void reverse(int num)
	{
		int rev = 0;
		
		while(num > 0)
		{
			
			rev = rev * 10 + (num%10);
			num /= 10;
		}
		
		System.out.println("Reverse Number : " + rev);
	}
	
	
	public void prime(int num)
	{
		int c = 2;
		
		while(c <= num/2)
		{
			if(num % c == 0)
			{
				break;
				
			}
				c++;
		}
		if(c > num/2)
		{
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not  prime");
			
		}
	}

}

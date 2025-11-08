package Basics;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();
		
		if(harshad(n))
		{
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not A Harshad Number");
		}
		
	}
	
	public static boolean harshad(int n)
	{
		int sum  = 0, num = n;
	
		while(n > 0)
		{
		
			sum +=  n % 10;
			
			n /= 10;
		}
		
		return  num % sum == 0;
	}

}

/*
 Example with 24:
 The digits are 2 and 4.
 The sum of the digits is (2+4=6).
 24 divided by 6 is 4.Since 4 is a whole number, 
 24 is a Harshad number.
 
 */

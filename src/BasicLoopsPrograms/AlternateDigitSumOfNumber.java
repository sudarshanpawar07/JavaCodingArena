package BasicLoopsPrograms;

import java.util.Scanner;

public class AlternateDigitSumOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int sum = 0,dup = num;
		sc.close();
		
		while(num != 0)
		{
			int last = num % 10;
			sum += last;
			num/=100;
		}
		System.out.println(dup + " Aternate Digit Sum is : " +sum);

	}

}

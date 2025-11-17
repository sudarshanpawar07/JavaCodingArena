package BasicProgramming;

import java.util.Scanner;

public class FactorialSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0, dup = num;
		sc.close();
		//Krish Number or peterson
		while (num != 0) {
			int fact = 1;
			int last = num % 10;

			for (int i = last; i >= 1; i--) {
				fact *= i;
			}
			sum = sum + fact;
			num /= 10;
		}
		System.out.println("Num is : " + dup);
		System.out.println("The sum of Factorial as : " + sum);
	}

}

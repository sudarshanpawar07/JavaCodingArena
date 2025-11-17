package BasicProgramming;

import java.util.Scanner;

public class SumOfOddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		while (num != 0) {
			int last = num % 10;
			if (last % 2 != 0) {
				sum += last;
			}

			num /= 10;
		}
		System.out.println("Sum of odd digits is : " + sum);

	}

}

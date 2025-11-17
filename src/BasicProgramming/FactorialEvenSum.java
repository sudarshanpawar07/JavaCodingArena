package BasicProgramming;

import java.util.Scanner;

public class FactorialEvenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0, dup = num;
		sc.close();
		while (num != 0) {
			int fact = 1;
			int last = num % 10;

			if (last % 2 == 0) {
				for (int i = last; i >= 1; i--) {
					fact = fact * i;
				}
				sum += fact;
			}

			num /= 10;
		}
		System.out.println(dup);
		System.out.println("The sum Of odd Digit is : " + sum);

	}

}

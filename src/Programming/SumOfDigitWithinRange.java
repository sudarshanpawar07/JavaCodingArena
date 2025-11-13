package Programming;

import java.util.Scanner;

public class SumOfDigitWithinRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int sum = 0, temp = num;
		if (num > 0 && num < 1000) {
			while (num != 0) {
				int last = num % 10;
				sum += last;
				num /= 10;

			}

			System.out.println("Sum of digit of Number " + temp + " is : " + sum);

		} else {
			System.out.println("Number is not in range of 0 - 1000 please Enter the number in a range");
		}

	}

}

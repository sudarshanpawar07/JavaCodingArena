package BasicLoopsPrograms;

import java.util.Scanner;

public class DecreasingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int last = num % 10;
		num /= 10;
		boolean flag = true;
		while (num > 0) {
			int rem = num % 10;
			if (last > rem) {
				flag = false;
				break;
			}
			last = rem;
			num /= 10;
		}
		if (flag)
			System.out.println("The Number is Decreasing.");
		else
			System.out.println("The Number is not Decreasing.");

	}

}

package BasicLoopsPrograms;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number.");
		int num = sc.nextInt();
		sc.close();
		int sum = 0, prod = 1;

		for (int i = num; i > 0; i /= 10) {
			sum = sum + (i % 10);
			prod = prod * (i % 10);
		}
		if (sum == prod)
			System.out.println(num + " is a Spy Number.");
		else
			System.out.println(num + " is not a spy Number.");
	}

}

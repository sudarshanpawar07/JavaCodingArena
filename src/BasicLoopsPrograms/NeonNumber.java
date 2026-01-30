package BasicLoopsPrograms;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int sum = 0, sqr = num * num;

		for (int i = sqr; i > 0; i /= 10)
			sum = sum + (i % 10);
		System.out.println(sum);
		if (num == sum)
			System.out.println(num + " is Neon Number.");
		else
			System.out.println(num + " is Not a Neon Number.");
	}

}

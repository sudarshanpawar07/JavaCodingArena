package BasicProgramming;

import java.util.Scanner;

public class ExampleHiTwoHiFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();

		if (num % 2 == 0 && num % 5 == 0) {
			System.out.println("HiTwoFive");
		} else if (num % 2 == 0) {
			System.out.println("HiTwo");
		} else {
			System.out.println("HiFive");
		}
	}

}

package BasicLoopsPrograms;

import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		System.out.print("Factors of Number is : ");
		sc.close();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}

package BasicProgramming;

import java.util.Scanner;

public class Emvripp {
	public static void main(String[] args) {
		// i/p -> 13 then o/p -> 31 both are prime
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int dup = num;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " num is not Prime.");
				return;
			}
		}
		System.out.println(num + " num is Prime. ");
		
		int reversedNum = 0;
		while (dup > 0) {
			int rem = dup % 10;
			reversedNum = reversedNum * 10 + rem;
			dup /= 10;
		}

		for (int i = 2; i < reversedNum; i++) {
			if (reversedNum % i == 0) {
				System.out.println(reversedNum + " rev num is not Prime.");
				return;
			}
			
		}
		System.out.println(reversedNum + " rev num is Prime.");

	}

}

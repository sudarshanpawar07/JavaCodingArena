package BasicLoopsPrograms;

import java.util.Scanner;

public class Emvirpp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();

		int dup = num;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not Prime.");
				return;
			}

		}
		System.out.println(num + " is prime");

		int reverseNum = 0;
		while (dup != 0) {
			int last = dup % 10;
			reverseNum = reverseNum * 10 + last;
			dup /= 10;
		}
//		System.out.println(reverseNum);

		for (int i = 2; i <reverseNum; i++) {
			if (reverseNum % i == 0) {
				System.out.println(reverseNum + " rev num is not prime.");
				return;
			}
		}
		System.out.println(reverseNum + " rev num is also Prime Number.");
	}
}

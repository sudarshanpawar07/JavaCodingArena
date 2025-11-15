package BasicProgramming;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num, dumy = num;
		sc.close();
		int rev = 0;
		while (num != 0) {

			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;

		}
		System.out.println("using while loop -> " + rev);

		int rev1 = 0;
		// implementation using for loop
		for (int i = temp; i != 0; i /= 10) {
			int last = i % 10;
			rev1 = rev1 * 10 + last;

		}
		System.out.println("using for  loop -> " + rev1);
		int rev2 = 0;
		do {
			int last = dumy % 10;
			rev2 = rev2 * 10 + last;
			dumy /= 10;

		} while (dumy != 0);

		System.out.println("using do-while loop -> " + rev2);

	}

}

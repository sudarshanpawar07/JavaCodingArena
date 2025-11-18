package BasicLoopsPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int rev = 0, dup = num;
		sc.close();
		while (num != 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;

		}
		System.out.println(dup + " Reverse Number is : " + rev);
	}

}

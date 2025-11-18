package BasicLoopsPrograms;

import java.util.Scanner;

public class MinDigitOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int min = 9;
		sc.close();
		for (int i = num; i > 0; i /= 10) {
			int dgt = i % 10;
			if (min > dgt) {
				min = dgt;
			}
		}
		System.out.println(num + " Minimum Digit of Number is : " + min);
	}

}

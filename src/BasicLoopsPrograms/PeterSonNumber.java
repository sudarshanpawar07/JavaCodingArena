package BasicLoopsPrograms;

import java.util.Scanner;

public class PeterSonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int sum = 0, dup = num;
		while (num > 0) {
			int rem = num % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			num /= 10;
		}
		System.out.println((sum == dup) ? dup + (" is a Peterson Number.") : dup + (" is not a PeterSon Number."));
	}

}

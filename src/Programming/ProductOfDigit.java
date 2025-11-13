package Programming;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int pro = 1;
		while (num != 0) {
			int last = num % 10;
			pro *= last;
			num /= 10;
		}
		System.out.println("Product of digit is : " + pro);

	}

}

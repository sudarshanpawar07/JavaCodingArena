package BasicProgramming;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number1 : ");

		float num1 = sc.nextFloat();
		System.out.println("Enter the Number2 : ");
		float num2 = sc.nextFloat();

		System.out.println("Enter the Number1 : ");
		char ch = sc.next().charAt(0);
		sc.close();

		System.out.println((ch == '+') ? num1 + num2
				: (ch == '-') ? num1 - num2 : (ch == '*') ? num1 * num2 : (ch == '/') ? num1 / num2 : 0.000f);
	}

}

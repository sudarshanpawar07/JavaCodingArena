package BasicProgramming;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of a Number is : " + fact);
	}

}

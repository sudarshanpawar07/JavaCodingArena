package BasicProgramming;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		System.out.println("Enter the Power : ");
		int power = sc.nextInt();
		sc.close();
		int op = 1;

		for (int i = 1; i <= power; i++) {
			op *= num;
		}
		System.out.println("Power of Number is : " + op);
	}

}

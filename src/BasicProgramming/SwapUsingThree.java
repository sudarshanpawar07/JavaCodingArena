package BasicProgramming;

import java.util.Scanner;

public class SwapUsingThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number2 : ");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("Number Before Swapping : " + " num1 : " + num1 + " num2 : " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("Number After Swapping : " + " num1 : " + num1 + " num2 : " + num2);

	}

}

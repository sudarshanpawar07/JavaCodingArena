package BasicLoopsPrograms;

import java.util.Scanner;

public class BuzzNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		if (num % 7 == 0 || num % 10 == 7)
			System.out.println(num + " is Buzz Number.");
		else
			System.out.println(num + " is not a Buzz Number.");

	}

}

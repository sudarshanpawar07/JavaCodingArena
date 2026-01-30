package BasicLoopsPrograms;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int len = 0, div = 1;
		for (int i = num; i > 0; i /= 10)
			len++;
		for (int i = 1; i <= len; i++)
			div *= 10;
		int newNum = (num * num) % div;
		if (newNum == num)
			System.out.println(num + " is Automorphic Number.");
		else
			System.out.println(num + " is not a 77Automorphic Number.");
	}

}

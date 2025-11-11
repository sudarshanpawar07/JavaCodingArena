package Basics;
import java.util.Scanner;

public class NaturalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("Sum of Natural number "+ naturalSum(n));
		sc.close();

	}

	public static int naturalSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}

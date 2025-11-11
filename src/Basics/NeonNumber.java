package Basics;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();
		if (neonNumber(n) == n) {
			System.out.println(n +" is Neon Number");
		} else {
			System.out.println(n + " is not  Neon Number");
		}

	}

	public static int neonNumber(int n) {
		int sq = n * n;
		int sum = 0;
		while (sq != 0) {
			int last = sq % 10;
			sum += last;
			sq /= 10;
		}
		return sum;
	}
}

/*

A neon number is a number where the sum of the digits 
of its square equals the original number. 
For example, 9 is a neon number because \(9^{2}=81\), and \(8+1=9\). 
The only small neon numbers are 0, 1, and 9. 

*/
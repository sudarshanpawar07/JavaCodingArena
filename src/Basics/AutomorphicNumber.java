package Basics;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();
		
		if(automorphic(n) == n)
		{
			System.out.println("Automorphic Number");
		}else {
			System.out.println("Not Automorphic Number");
		}

	}
	
	public static int automorphic(int n) {
		
		int square = n * n;
		return square%10;
	}

}

/*
 An Automorphic number is a number whose square “ends” in the same digits as the number itself.
  Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625
  
  */

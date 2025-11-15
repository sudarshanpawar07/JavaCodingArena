package BasicProgramming;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Digit : ");
		char ch = sc.next().charAt(0);
		sc.close();
		System.out.println((ch >= '0' &&  ch <= '9') ? (ch + " is digit") : (ch + " is not digit"));
		
	}

}

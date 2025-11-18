package BasicLoopsPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String rev = "";
		sc.close();
		for (int i = 0; i < str.length(); i++)
			rev = str.charAt(i) + rev;
		
		if (str.equals(rev)) {
			System.out.println("String Palindrome");

		} else {
			System.out.println("string is not Palindrome.");

		}

	}

}

package BasicProgramming;

import java.util.Scanner;

public class VowelOfName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = sc.nextLine().toUpperCase();
		sc.close();

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			System.out.println(ch);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(" - This is a vowel");
			} else {
				System.out.println();
			}
		}

	}

}

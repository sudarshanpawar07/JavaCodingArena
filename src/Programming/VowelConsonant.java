package Programming;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char ch = sc.next().charAt(0);
		sc.close();

		System.out.println((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
				|| ch == 'O' || ch == 'U') ? (ch + " is vowel") : (ch + " is Consonant"));
	}
}

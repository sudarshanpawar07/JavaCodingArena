package Programming;

import java.util.Scanner;

public class LowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch = sc.next().charAt(0);
		sc.close();
		System.out.println(
				(ch >= 97 && ch <= 122) ? (ch + " is Lowercase character") : (ch + " is not Lowercase character"));

	}

}

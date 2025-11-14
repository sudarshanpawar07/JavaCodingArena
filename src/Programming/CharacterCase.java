package Programming;

import java.util.Scanner;

public class CharacterCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		System.out.println(
				(ch >= '0' && ch <= '9') || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? (ch + " is Character")
						: (ch + " is Special character"));

	}

}

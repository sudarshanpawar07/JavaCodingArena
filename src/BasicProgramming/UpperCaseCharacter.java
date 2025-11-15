package BasicProgramming;

import java.util.*;

public class UpperCaseCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Caharacter : ");
		char ch = sc.next().charAt(0);
		sc.close();

		System.out.println(
				(ch >= 65 && ch <= 90) ? (ch + " is UpperCase Character.") : (ch + " is not Uppercase Character."));

	}

}

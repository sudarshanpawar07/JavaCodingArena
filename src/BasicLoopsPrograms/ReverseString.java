package BasicLoopsPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String rev = "", rev1 = "";
		sc.close();

		// 1st way
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;

		}
		System.out.println(rev);

		// 2nd way
		for (int i = 0; i <= str.length() - 1; i++) {
			rev1 = str.charAt(i) + rev1;
		}
		System.out.println(rev1);

		// 3rd way

		StringBuffer rev2 = new StringBuffer(str);
		System.out.println(rev2.reverse());
	}

}

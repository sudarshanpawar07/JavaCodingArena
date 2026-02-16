package Exam;

public class Reverse {

	public static void main(String[] args) {
		String str = "naman";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(str + " : " + rev);

		// palindrome string

		if (rev == str) {
			System.out.println(str + " String Palindrome.");
		} else {
			System.out.println(str + " String is not Palindrome.");
		}

	}

}

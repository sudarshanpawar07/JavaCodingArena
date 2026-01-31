package BasicLoopsPrograms;

import java.util.Scanner;

public class HighestRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		String str = sc.next().toUpperCase();
		sc.close();
		int max = 0;
		char mxChar = '0';
		for (char ch = 'A'; ch < 'Z'; ch++) {
			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (ch == c) {
					cnt++;
				}
				if (max < cnt) {
					max = cnt;
					mxChar = ch;
				}
			}
		}
		System.out.println("Max Repeating character " + mxChar + " with " + max);

	}

}

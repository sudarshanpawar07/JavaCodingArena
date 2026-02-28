package hashTable;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SolveBrackets {
	public static void main(String[] args) {

		ArrayDeque<Character> ad = new ArrayDeque<Character>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String brackets = sc.next();

		if (brackets.length() % 2 == 0) {
			for (int i = 0; i < brackets.length(); i++) {
				char ch = brackets.charAt(i);
				if (ch == '[' || ch == '{' || ch == '(') {
					ad.push(ch);
				} else if (ch == ']' && ad.peek() == '[' || ch == '}' && ad.peek() == '{'
						|| ch == ')' && ad.peek() == '(') {
					ad.pop();

				} else {
					ad.push(ch);
				}
			}

		}

		if (ad.size() == 0) {
			System.out.println("Balanced");
		} else {
			System.out.println("not balanced.");
		}

	}

}

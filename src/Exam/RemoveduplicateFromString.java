package Exam;

import java.util.*;

public class RemoveduplicateFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		StringBuilder result = new StringBuilder();
		HashSet<Character> set = new HashSet<>();

		for (char c : s.toCharArray()) {
			if (!set.contains(c)) {
				set.add(c);
				result.append(c);
			}
		}

		System.out.println(result);
	}
}
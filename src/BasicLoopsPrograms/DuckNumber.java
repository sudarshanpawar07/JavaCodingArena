package BasicLoopsPrograms;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number.");
		String num = sc.next();
		sc.close();
		if (num.charAt(0) != '0' && num.contains("0"))
			System.out.println(num + " is Duck Number.");
		else
			System.out.println(num + " is not a Duck Number.");

	}

}

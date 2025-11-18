package BasicLoopsPrograms;

import java.util.Scanner;

public class RepeatingDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int mx = 0, dgt = 0;
		sc.close();

		for (int i = 0; i <= 9; i++) {
			int cnt = 0;
			for (int j = num; j > 0; j /= 10) {
				int last = j % 10;
				if (i == last) {
					cnt++;
				}

			}
			if (cnt != 0) {
				if (mx < cnt) {
					mx = cnt;
					dgt = i;
				}
			}
		}
		System.out.println("Max Digit is " + dgt + " with a frequency Of " + mx);
	}

}

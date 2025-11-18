package BasicLoopsPrograms;

import java.util.Scanner;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
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
				System.out.println(i + " : " + cnt);
			}
		}

	}

}

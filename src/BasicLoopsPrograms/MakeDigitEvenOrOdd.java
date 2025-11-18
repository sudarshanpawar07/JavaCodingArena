package BasicLoopsPrograms;

import java.util.Scanner;

public class MakeDigitEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int cnt = 0, dup = num;
		sc.close();
		while (num > 0) {
			cnt++;
			num /= 10;
		}
		String newNum = "";
		if (cnt % 2 == 0) {
			for (int i = dup; i > 0; i /= 10) {
				int last = i % 10;
				if (last % 2 != 0) {
					newNum = ++last + newNum;
				} else {
					newNum = last + newNum;
				}
			}
		} else {
			for (int i = dup; i > 0; i /= 10) {
				int last = i % 10;
				if (last % 2 == 0) {
					newNum = ++last + newNum;
				} else {
					newNum = last + newNum;
				}
			}
		}

		System.out.println(dup + " : " + newNum);

	}

}

package Basics;

import java.util.Scanner;

public class DigitToword {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		String digitWord = " ";
		int num = n;
		sc.close();

		while (n > 0) {
			int r = n % 10;

			switch (r) {
			case 0:
				digitWord = "Zero" + digitWord;
				break;
			case 1:
				digitWord = "One" + digitWord;
				break;
			case 2:
				digitWord = "Two" + digitWord;
				break;
			case 3:
				digitWord = "Three" + digitWord;
				break;
			case 4:
				digitWord = "Four" + digitWord;
				break;
			case 5:
				digitWord = "Five" + digitWord;
				break;
			case 6:
				digitWord = "Six" + digitWord;
				break;
			case 7:
				digitWord = "Seven" + digitWord;
				break;
			case 8:
				digitWord = "Eight" + digitWord;
				break;
			case 9:
				digitWord = "Nine" + digitWord;
				break;

			}
			n /= 10;
		}
		System.out.println(num + ":" + digitWord);

	}

}

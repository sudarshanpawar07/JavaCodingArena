package BasicLoopsPrograms;

import java.util.Scanner;

public class HightDigitOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int mx = 0;
		sc.close();
		for (int i = num; i > 0; i /= 10) {
			int last = i % 10;
			if (mx < last) {
				mx = last;
			}
		}
		System.out.println(num + " Max digit of Number is : " + mx);

	}

}

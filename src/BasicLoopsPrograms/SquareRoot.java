package BasicLoopsPrograms;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		boolean flag = false;
		for (int i = 1; i <= num; i++) {
			if (i * i == num) {
				flag = true;
				System.out.println(i + " is Perfect Square Root for " + num);
			}

			if (i * i > num) {
				break;
			}

		}
		if (!flag) {
			System.out.println(num + " is not having Perfect square root.");
		}
	}

}

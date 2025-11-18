package BasicLoopsPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println((cnt == 2) ? num + " is Prime" : num + " is not Prime.");

	}

}

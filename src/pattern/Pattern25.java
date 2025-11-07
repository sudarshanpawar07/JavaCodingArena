package pattern;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(j);
			}

			System.out.println();
		}

	}

}
/*

1
12
123
1234

*/
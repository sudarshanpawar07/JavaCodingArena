package pattern;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
/*

54321
4321
321
21
1

*/
package pattern;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1 ; i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				System.out.print((char)(64+i));
			}
			
			System.out.println();
		}
		

	}

}
/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

 */

package pattern;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i =1;i<=n;i++)
		{
			int num = i;
			for(int j = 1;j<n;j++)
			{
				num = num + n;
				System.out.print(num +" ");
			}
			
			System.out.println();
		}
	}

}
/*
 
6 11 16 21 
7 12 17 22 
8 13 18 23 
9 14 19 24 
10 15 20 25 

*/

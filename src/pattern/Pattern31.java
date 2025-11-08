package pattern;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i =1; i<=num;i++)
		{	
				int x = i;
			for(int j = 1; j<= i;j++)
			{
				System.out.print(x + " ");
				x = x + (num -j);
			}
			System.out.println();
		}

	}

}

/*

1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 

*/
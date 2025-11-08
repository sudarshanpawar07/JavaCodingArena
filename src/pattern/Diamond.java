package pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int sp = num/2,st = 1;
		sc.close();
		
		for(int i = 1 ;i<= num ; i++)
		{
			for(int j = 1; j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j<= st;j++)
			{
				System.out.print("* ");
			}
			
			if(i <= num /2)
			{
				st = st + 2;
				sp--;
			}
			else {
				st = st - 2;
				sp++;
			}
			System.out.println();
		}
	}

}

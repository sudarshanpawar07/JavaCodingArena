package pattern;

import java.util.Scanner;

public class TimeZonne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int sp = 0;
		int st = num;
		for(int i = 1; i<= num ; i++) {
			for(int j = 1 ; j <= sp;j++)
			{
				System.out.print("  ");
			}
			
			for(int j = 1; j <= st;j++)
			{
				System.out.print("* ");
			}
			
			if(i <= num/2)
			{
				sp++;
				st = st-2;
			}
			else {
				sp--;
				st = st + 2;
			}
			System.out.println();
		}
		
	}

}
/*
 
 * * * * * * * 
  * * * * * 
    * * * 
      * 
    * * * 
  * * * * * 
* * * * * * * 

*/

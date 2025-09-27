package loops;
import java.util.*;
public class Hcm {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int num2 = sc.nextInt();
		
		int small = num1 < num2 ? num1 : num2;
		sc.close();
		
		while(true)
		{
			if(num1 % small == 0 && num2 % small == 0)
			{
				System.out.println("HCF is : " + small);
				break;
			}
			small--;
		}
		

	}

}

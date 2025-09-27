package loops;
import java.util.*;
public class LcmPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int num2 = sc.nextInt();
		int largest = num1 > num2 ? num1  : num2;
		
		sc.close();
		
		for(int i = 1 ; ;i++)
		{
			if((largest * i ) % num1 == 0 && (largest * i) % num2 == 0)
			{
				int lcmPrime = largest * i;
				int den = 2;
				while(den < lcmPrime)
				{
					if(lcmPrime % den == 0)
					{
						break;
					}
					den++;
				}
				
				if(lcmPrime != 1 && den == lcmPrime)
				{
					System.out.println("Founded Lcm is Prime");
					break;
				}
				else {
					System.out.println("NO Lcm is Not Prime ");
					break;
				}
			}
		}

	}

}

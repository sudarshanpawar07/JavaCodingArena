package loops;
import java.util.*;
public class HcmPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter  the Number 2 : ");
		int num2 = sc.nextInt();
		sc.close();
		int small = num1 < num2 ? num1 : num2;
		
		while(true)
		{
			if(num1 % small == 0 && num2 % small == 0)
			{
				int hcfPrime = small;
				int den = 2;
				while(den <= hcfPrime)
				{
					if(hcfPrime % den == 0)
					{
						break;
					}
					den++;
				}
				if(hcfPrime != 1 && den == hcfPrime)
				{
					System.out.println("HCF is Prime");
					break;
				}
				else {
					System.out.println("HCF is not Prime");
					break;
				}
			}
			small--;
		}

	}

}

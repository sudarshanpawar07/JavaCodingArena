package loops;
import java.util.*;
public class Lcm {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first Number : ");
	int num1 = sc.nextInt();
	System.out.print("Enter the Second Number : ");
	int num2 = sc.nextInt();
	
	sc.close();
	int largest = num1 > num2 ? num1 : num2;
	
	for(int i = 1;;i++)
	{
		if((largest * i)%num1 == 0 && (largest * i )%num2 == 0)
		{
			System.out.println("LCM is : " + (largest * i));
			break;
		}
	}

	}

}

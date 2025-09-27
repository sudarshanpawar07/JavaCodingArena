package loops;
import java.util.*;
public class NearestFiboNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Number : ");
	int num = sc.nextInt();
	int n1 = 0,n2 = 1,n3;
	sc.close();
	while(n2 <= num)
	{
		n3 = n1 + n2;
		
		n1 = n2;
		n2 = n3;
		
	}
	if(n1 == num)
	{
		System.out.println("It is Fibo Number ");
	
	}
	else if(num -n1 < n2 - num)
	{
		System.out.println(n1 +  " is the Nearest Fibo Number");
	}
	else {
		System.out.println(n2 + " is the Nearest Fibo Number");
	}
	}

}

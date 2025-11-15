package BasicProgramming;
import java.util.*;
public class EvenNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int num = sc.nextInt();
	sc.close();
	
	if(num % 2 == 0)
	{
		System.out.println(num + " is Even ");
	}
	else {
		System.out.println(num + " is Not Even ");
	}

	}

}

package BasicProgramming;

import java.util.*;

public class EvenNumberWithoutModulous {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		if ((num / 2) * 2 == num) {
			System.out.println(num + " is Even ");
		} else {
			System.out.println(num + " is Even ");
		}

		// another approach

		if (num / 2 == num / 2.0) {
			System.out.println(num + " is Even ");
		} else {
			System.out.println(num + " is Even ");
		}
	}

}

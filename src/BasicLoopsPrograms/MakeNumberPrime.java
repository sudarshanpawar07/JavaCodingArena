package BasicLoopsPrograms;

import java.util.Scanner;

public class MakeNumberPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		sc.close();

		//boolean flag = true;
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				//flag = false;
				num++;
				i = 2;
			}
		}
		System.out.println("num : " + num);

	}

}

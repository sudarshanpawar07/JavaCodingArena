package BasicLoopsPrograms;

import java.util.Scanner;

public class BinaryNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		sc.close();
		String bin = Integer.toBinaryString(num);
		System.out.println(num + " : " + bin);

	}

}

package Programming;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter the number2 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the number3 : ");
		int num3 = sc.nextInt();
		sc.close();
		int lar = (num1 > num2) ? num1 : num2;
		System.out.println("Largest amoung Two is : " + lar);

		int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		System.out.println("largest among three : " + largest);

	}

}

package ExceptionHandling;

import java.util.Scanner;

public class UserArithmeticExceptionDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2 : ");
		int num2 = sc.nextInt();

		int div = 0;
		try {
			div = evaluate(num1, num2);
		} catch (UserArithmeticException uae) {
			System.out.println(uae.getMessage());
		}
		System.out.println("division : " + div);

		sc.close();
	}

	public static int evaluate(int num1, int num2) {
		if (num2 == 0) {
			throw new UserArithmeticException("/ by zero");
		}
		int div = num1 / num2;
		return div;
	}
}

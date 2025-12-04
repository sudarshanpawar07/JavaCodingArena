package ExceptionHandling;

import java.util.Scanner;

public class GetMessageExampleExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m1(sc.nextInt(), sc.nextInt());
		sc.close();
	}

	public static void m1(int n1, int n2) {
		System.out.println("m1() starts");
		try {
			System.out.println("try.");
			if (n2 == 0) {
				throw new ArithmeticException("kuch bhii");
			}
			System.out.println(n1 / n2);
		} catch (ArithmeticException ae) {
			System.out.println("catch");
			System.out.println(ae.getClass().getName() + " : " + ae.getMessage());
		}
		System.out.println("m1() ends.");

	}

}

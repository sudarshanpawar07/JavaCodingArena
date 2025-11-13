package Programming;

import java.util.Scanner;

public class ConvertPoundsintoKilo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		double pound = sc.nextFloat();
		final double KILO = 0.454;
		sc.close();
		double kiloGrams = pound * KILO;

		System.out.println(pound + " Pounds is " + kiloGrams + " Kilogram.");

	}

}
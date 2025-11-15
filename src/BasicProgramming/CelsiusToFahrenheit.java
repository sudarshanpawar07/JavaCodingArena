package BasicProgramming;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temp in Celsius :  ");
		double celsius = sc.nextDouble();
		sc.close();

		double fahrenheit = (9.0 / 5) * celsius + 32;

		System.out.println("Celsius : " + celsius + "Fahrenheit : " + fahrenheit);

	}

}

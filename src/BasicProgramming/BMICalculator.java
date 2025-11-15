package BasicProgramming;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Weight in pounds : ");
		float weight = sc.nextFloat();
		System.out.println("Enter the Height in inches : ");
		float meter = sc.nextFloat();
		sc.close();

		float kilo = weight * 0.45359237f;
		float nuter = kilo / (meter * meter);

		System.out.println("BMI is : " + nuter);

	}

}

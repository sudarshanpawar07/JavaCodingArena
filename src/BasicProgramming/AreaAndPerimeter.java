package BasicProgramming;

import java.util.Scanner;

public class AreaAndPerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		int radius = sc.nextInt();
		sc.close();

		final double PI = 22.0 / 7.0;

		double area = PI * (radius * radius);
		double perimeter = 2 * PI * radius;
		System.out.println("Area of circle is " + area + " and Perimeter of circle is " + perimeter);

	}

}

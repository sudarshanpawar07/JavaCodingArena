package BasicProgramming;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width : ");
		double width = sc.nextFloat();
		System.out.println("Enter the Height : ");
		double height = sc.nextFloat();
		sc.close();

		double area = height * width;
		double perimeter = 2 * (height + width);

		System.out.println("Area O rectangle is " + area + " and Perimeter of rectangle  is " + perimeter);

	}

}

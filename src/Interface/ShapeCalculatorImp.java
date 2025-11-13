package Interface;

public class ShapeCalculatorImp implements ShapeCalculator {
	public void areaOfTriangle(double base, double height) {
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle is : " + area);

	}

	public void perimeterOfSquare(double side) {
		double area = 4 * side;
		System.out.println("Perimeter of Square " + area);
	}

	public void areaOfCircle(double rad) {
		double area = PI * (rad * rad);
		System.out.println("Area of Circle is : " + area);
	}

	public void areaOfSquare(double side) {
		double area = side * side;
		System.out.println("Area of Square is : " + area);
		
	}
	
	public static void message(String name)
	{
		System.out.println("Hey ! " + name + " Welcome to the Shape Implementation .");
	}

}

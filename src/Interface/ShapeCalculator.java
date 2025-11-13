package Interface;

public interface ShapeCalculator {
	double PI = 22.0/7.0;

	public abstract void areaOfCircle(double rad);
	
	abstract void areaOfSquare(double side);
	 void perimeterOfSquare(double side);
	 void areaOfTriangle(double base, double height);
	
	public static void message(String name)
	{
		System.out.println("Hey ! " + name + " Welcome to Shape Calculator.");
	}
	
}

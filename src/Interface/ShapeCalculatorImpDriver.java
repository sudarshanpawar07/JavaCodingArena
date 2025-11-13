package Interface;

public class ShapeCalculatorImpDriver {

	public static void main(String[] args) {
		ShapeCalculator s1 = new ShapeCalculatorImp();
		s1.areaOfCircle(78);
		s1.areaOfSquare(20);
		s1.areaOfTriangle(35,50);
		s1.perimeterOfSquare(45);
		ShapeCalculator.message("RANI");
		ShapeCalculatorImp.message("RAJA");
	
	}

}

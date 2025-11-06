package Abstract;

public abstract class Calculator {
	
	public abstract void addition(int v1,int v2);
	public abstract void subtraction(int v1,int v2);
	public abstract void multiplication(int v1,int v2);
	
	public void division(int v1,int v2) {
		System.out.println(v1 / v2);
	}

}

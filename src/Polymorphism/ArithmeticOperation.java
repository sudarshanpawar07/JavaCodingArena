package Polymorphism;

public class ArithmeticOperation {
	public static int addition(int num1,int num2)
	{
		return addition(num1,num2,0);
	}
	public static int addition(int num1,int num2,int num3)
	{
		return addition(num1,num2,num3,0);
	}
	
	public static int addition(int num1,int num2,int num3,int num4)
	{
		return addition(num1,num2,num3,num4,0);
	}
	public static int addition(int num1,int num2,int num3,int num4,int num5)
	{
		int op = num1 + num2 + num3 + num4 + num5;
		return op;
	}
}

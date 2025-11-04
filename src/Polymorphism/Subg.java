package Polymorphism;

public class Subg {
	
	Subg(String name, int ver)
	{
		System.out.println("Name : "  + name + "Version :" + ver);
	}

	public void moveForward(int steps)
	{
		System.out.println("Move forward " + steps + " sucessfully");
	}

	
	public void moveBackward(int steps)
	{
		System.out.println("Move Backward " + steps + " sucessfully");
	}
	
	public void turnLeft()
	{
		System.out.println("turn right");
	}
	public void turnRight()
	{
		System.out.println("turn right");
	}

}

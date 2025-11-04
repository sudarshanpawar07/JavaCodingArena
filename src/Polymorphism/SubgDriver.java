package Polymorphism;

public class SubgDriver {

	public static void main(String[] args) 
	{
		Subg s1 = new Subg("Subg",1);
		s1.moveBackward(5);
		s1.turnRight();
		s1.moveForward(7);
		s1.turnLeft();
		
		System.out.println("=======================");
		
		Subg s2 = new SubgV2("Subg",2);
		s2.moveForward(56);
		s2.moveBackward(34);
		s2.turnLeft();
		s2.turnRight();
	}

}

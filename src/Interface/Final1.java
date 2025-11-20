package Interface;

public class Final1 {
	
	// final String name; -> CTE
	final String name = "nana";
	final int age; // this is are the non-static final variable
	{
		age = 200;
	}

	final double PER;
	public Final1(double PER)
	{
		this.PER = PER;
	}
	public static void main(String[] args) {
		Final1 o = new Final1(97.60);
		System.out.println(o.name);
		System.out.println(o.age);
		System.out.println(o.PER);

	}

}

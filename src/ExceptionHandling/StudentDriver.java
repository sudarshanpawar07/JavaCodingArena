package ExceptionHandling;

public class StudentDriver {
	public static void main(String[] args) {
		System.out.println("main starts");
		Student obj = new Student("Nana", "SID123");
		System.out.println(obj);
		obj = null;
		System.gc();
		System.out.println("main ends");
	}

}

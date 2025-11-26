package ExceptionHandling;

public class Student {
	String name;
	String id;

	Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;

	}

	public String toString() {
		return id + " : " + name;
	}

	@Override
	public void finalize() {
		System.out.println(10 / 0);
		System.out.println("Object remove from heap.");
	}
}

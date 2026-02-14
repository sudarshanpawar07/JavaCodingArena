package Collection;

public class ComparatorStudent {
	String name;
	int age;
	double per;
	String deg;

	public ComparatorStudent() {

	}

	ComparatorStudent(String name, int age, double per, String deg) {
		super();
		this.age = age;
		this.per = per;
		this.deg = deg;
		this.name = name;

	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", per=" + per + ", deg=" + deg + "]";
	}

}

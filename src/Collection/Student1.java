package Collection;

public class Student1 implements Comparable<Student1> {
	String name;
	int age;
	double per;
	String deg;

	public Student1() {

	}

	Student1(String name, int age, double per, String deg) {
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

	public int compareTo(Student1 ref) {
		return (this.per > ref.per) ? 1 : (this.per < ref.per) ? -1 : 0;
	}
}

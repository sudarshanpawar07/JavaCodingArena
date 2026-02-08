package Collection;

import java.util.*;

public class Student {
	String name;
	int yop;
	double cgpa;

	public Student(String name, int yop, double cgpa) {
		this.name = name;
		this.yop = yop;
		this.cgpa = cgpa;

	}

	public String toString() {
		return name + "  " + yop + "  " + cgpa;
	}

}

package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentYopAscending implements Comparator<Student> {
	@Override
	public int compare(Student obj1, Student obj2) {

		return obj1.yop - obj2.yop;
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("ramesh", 2025, 9.55));
		list.add(new Student("suresh", 2025, 9.05));
		list.add(new Student("ganesh", 2026, 8.35));
		list.add(new Student("mukesh", 2024, 7.45));
		list.add(new Student("mahesh", 2023, 6.35));
		list.stream().forEach(ele -> System.out.println(ele));
		Collections.sort(list, new StudentYopAscending());
		System.out.println("---------------------------------");
		list.stream().forEach(ele -> System.out.println(ele));
		System.out.println("---------------------------------");
		System.out.println("---------------CGPA--------------");
		list.sort((ele1, ele2)->(int) (ele1.cgpa - ele2.cgpa));
		list.stream().forEach(ele -> System.out.println(ele));
		System.out.println("---------------nameAscending--------------");
		list.sort((ele1, ele2)->ele1.name.compareTo(ele2.name));
		list.stream().forEach(ele -> System.out.println(ele));
		System.out.println("---------------nameDescending--------------");
		list.sort((ele1, ele2)->ele2.name.compareTo(ele1.name));
		list.stream().forEach(ele -> System.out.println(ele));

	}
}

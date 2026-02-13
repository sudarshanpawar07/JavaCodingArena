package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student1> db = new ArrayList<Student1>();
		db.add(new Student1("raju", 22, 78, "BSC"));
		db.add(new Student1("ramesh", 20, 87, "BCA"));
		db.add(new Student1("nana", 23, 49.50, "BE"));
		db.add(new Student1("mama", 24, 56, "Bcom"));
		db.add(new Student1("Donu", 21, 89, "BTech"));
		db.add(new Student1("Sonu", 23, 78, "BA"));
		db.add(new Student1("monu", 24, 78, "MA"));

		Collections.sort(db);
		System.out.println(db);

	}

}

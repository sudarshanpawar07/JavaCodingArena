package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorStudentDriver {
	public static void main(String[] args) {
		ArrayList<ComparatorStudent> db = new ArrayList<ComparatorStudent>();
		db.add(new ComparatorStudent("raju", 22, 78, "BSC"));
		db.add(new ComparatorStudent("ramesh", 20, 87, "BCA"));
		db.add(new ComparatorStudent("nana", 23, 49.50, "BE"));
		db.add(new ComparatorStudent("mama", 24, 56, "Bcom"));
		db.add(new ComparatorStudent("Donu", 21, 89, "BTech"));
		db.add(new ComparatorStudent("Sonu", 23, 78, "BA"));
		db.add(new ComparatorStudent("monu", 24, 78, "MA"));

		Comparator<ComparatorStudent> c1 = new Comparator<ComparatorStudent>() {

			@Override
			public int compare(ComparatorStudent o1, ComparatorStudent o2) {

				return o1.age > o2.age ? 1 : (o1.age < o2.age ? -1 : 0);
			}
		};
		Collections.sort(db, c1);
		System.out.println(db);

		Comparator<ComparatorStudent> c2 = new Comparator<ComparatorStudent>() {

			@Override
			public int compare(ComparatorStudent o1, ComparatorStudent o2) {

				return o1.name.compareToIgnoreCase(o2.name);
			}
		};
		Collections.sort(db, c2);
		System.out.println(db);

		Comparator<ComparatorStudent> c3 = (o1, o2) -> o1.per > o2.per ? 1 : (o1.per < o2.per ? -1 : 0);

		Collections.sort(db, c3);
		System.out.println(db);
	}

}

package set;

import java.util.HashSet;

public class CarDriver {

	public static void main(String[] args) {
		HashSet<Car> db = new HashSet<Car>();

		db.add(new Car("ramesh", "defender", 150000000, "Black"));
		db.add(new Car("ganesh", "swift", 150000000, "Black"));
		db.add(new Car("suresh", "fortuner", 150000000, "Black"));
		db.add(new Car("mahesh", "thar", 150000000, "Black"));
		db.add(new Car("mukesh", "suv", 150000000, "Black"));
		db.add(new Car("rani", "xuv", 150000000, "Black"));
		db.add(new Car("ramesh", "GT", 150, "white"));
		System.out.println(db);

	}

}

package Collection;

import java.util.ArrayList;

public class UserArrayListDriver {
	public static void main(String[] args) {
		UserArrayList<Integer> list = new UserArrayList<Integer>(18);

		list.add(10);
		list.add(10);
		list.add(30);
		list.add(40);
//		System.out.println(list.indexOf(-50));
//		System.out.println(list.contains(-50));
		System.out.println(list.lastIndexOf(80));

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(10);
		list1.add(30);
		list1.add(40);
		// System.out.println(list1.indexOf(-50));
		// System.out.println(list1.contains(-50));
		System.out.println(list1.lastIndexOf(80));

	}

}

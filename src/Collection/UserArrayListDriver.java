package Collection;

import java.util.ArrayList;

public class UserArrayListDriver {
	public static void main(String[] args) throws CloneNotSupportedException {
		UserArrayList<Integer> list = new UserArrayList<Integer>(18);

		list.add(10);
		list.add(10);
		list.add(30);
		list.add(40);
		System.out.println(list);

		UserArrayList<Integer> clone = (UserArrayList<Integer>) list.clone();
		System.out.println(clone);

		list.addAll(clone);
		System.out.println(list);

	}

}

package Collection;

import java.util.ArrayList;

public class UserArrayListDriver {
	public static void main(String[] args) {
		UserArrayList<Integer> list = new UserArrayList<Integer>(18);

		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		System.out.println(list.getLast());
		ArrayList<Integer> list1 = new ArrayList<>();
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		
	}

}

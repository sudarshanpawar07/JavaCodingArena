package Collection;

import java.util.*;

public class ListIteratorUnderstanding {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2, 23, 23, 45);
		System.out.println(list);

		ListIterator<Integer> it = list.listIterator();
		while (it.hasNext()) {
			int val = it.next();
			if (val % 2 == 0) {
				it.set(0); // -> replace all even no with 0
			}
		}
		System.out.println(list);

		ListIterator<Integer> it1 = list.listIterator(list.size());
		while (it1.hasPrevious()) {
			System.out.println(it1.previous()); // <- reverse the List
		}

		ListIterator<Integer> it2 = list.listIterator();
		while (it2.hasNext()) {
			int val = it2.next();
			if (val == 0) {
				it2.add(100);
			}
		}
		System.out.println(list);
	}

}

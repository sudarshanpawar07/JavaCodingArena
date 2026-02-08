package Collection;

import java.util.*;

public class ListIteratorExample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			list.add(i);
		System.out.println(list);
		ListIterator<Integer> it = list.listIterator();

		while (it.hasNext()) {
			if (it.nextIndex() == list.size() / 2)
				break;
			System.out.println(it.next() + " ");
		}
		System.out.println("-----------------------");
		
		while (it.hasPrevious()) {
			System.out.println(it.previous() + " ");
		}
		System.out.println("-----------------------");

	}

}

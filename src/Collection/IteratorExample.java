package Collection;

import java.util.*;

public class IteratorExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		System.out.println(list);

		Iterator<Integer> it = list.listIterator();

		while(it.hasNext()) {
			System.out.println(it.next());
			// reverse a List Using ListIterator
			//it.remove();
		}
		
		for(Integer e : list)
		{
			System.out.println(e); // we can iterate over for each loop as well
		}
		
	}

}

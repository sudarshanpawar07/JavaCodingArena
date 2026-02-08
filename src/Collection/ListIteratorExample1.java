package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample1 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(123);
		list.add("somthing");
		list.add(20);
		list.add(23.13);
		list.add('a');
		list.add(30);
		list.add(false);
		list.add(40);
		System.out.println(list);
		ListIterator<Object> li = list.listIterator();
		while (li.hasNext()) {
			Object obj = li.next();
			if (!(obj instanceof Integer))
				li.remove();
		}
		System.out.println(list);
	}

}

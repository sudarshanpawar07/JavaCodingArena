package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class AddAllElements {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		Collections.addAll(al, 1, 2, 3, 4, 5, 6, 78, 8, 90, 786, 99);
		Collections.sort(al);
		System.out.println(al);
	}
}

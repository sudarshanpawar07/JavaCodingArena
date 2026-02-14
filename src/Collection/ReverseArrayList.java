package Collection;

import java.util.*;

public class ReverseArrayList {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(al);
		for (int i = 0, j = al.size() - 1; i < al.size() / 2; i++, j--) {
			Integer temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
		}
		System.out.println(al);

		List<Integer> al1 = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(al1);
		for (int i = 0, j = al1.size() - 1; i < al1.size() / 2; i++, j--) {
			Collections.swap(al1, i, j);
		}
		System.out.println(al1);

		Collections.reverse(al1);
		System.out.println(al1);
	}

}

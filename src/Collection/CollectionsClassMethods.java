package Collection;

import java.util.*;

public class CollectionsClassMethods {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Collections.addAll(al, 1, 2, 3, 4, 5, 6);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 6));
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		Collections.addAll(al2, 10, 20, 30, 40, 50, 60);
		System.out.println(Collections.disjoint(al, al2));
		System.out.println(Collections.frequency(al, 1));
		Collections.rotate(al, 3);
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		

	}

}

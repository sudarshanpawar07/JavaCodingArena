package set;

import java.util.*;

public class HS1 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		System.out.print("From m1() : ");
		m1();
	}

	public static void m1() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);

	}

}

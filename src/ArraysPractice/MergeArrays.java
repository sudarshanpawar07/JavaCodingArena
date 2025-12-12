package ArraysPractice;

import java.util.*;

public class MergeArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2 };
		int[] b = { 8, 9, 10 };
		int[] c = new int[a.length + b.length];
		System.out.println(Arrays.toString(c));
		int max = a.length > b.length ? b.length : a.length;
		for (int i = 0, ci = 0; i <= max; i++) {
			if (i < a.length) {
				c[ci++] = a[i];
			}
			if (i < b.length) {
				c[ci++] = b[i];
			}

		}
		System.out.println("c : " + Arrays.toString(c));

	}

}

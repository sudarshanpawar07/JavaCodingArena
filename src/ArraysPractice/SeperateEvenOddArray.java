package ArraysPractice;

import java.util.*;

public class SeperateEvenOddArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Original Array : " + Arrays.toString(arr));

		int ecount = 0, ocount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				ecount++;
			if (arr[i] % 2 != 0)
				ocount++;
		}

		// System.out.println(ecount + " " + ocount);
		int[] evenArr = new int[ecount];
		int[] oddArr = new int[ocount];
		int eidx = 0, oidx = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[eidx++] = arr[i];
			}
			if (arr[i] % 2 != 0) {
				oddArr[oidx++] = arr[i];
			}
		}

		System.out.println("Even Array : " + Arrays.toString(evenArr));
		System.out.println("Odd Array : " + Arrays.toString(oddArr));

	}

}

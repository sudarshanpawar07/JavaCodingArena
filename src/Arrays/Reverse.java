package Arrays;

import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(arr));

		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("This is linear search with better Approach -> Two Pointer Approach. \n");
		int key = 5;
		int i = 0;
		boolean found = false;
		for (int j = arr.length - 1; i < arr.length / 2; i++, j--) {
			if (arr[i] == key) {
				found = true;
				break;
			}
			if (arr[j] == key) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Element Found.");
		} else {
			System.out.println("Element not Found.");
		}

	}

}

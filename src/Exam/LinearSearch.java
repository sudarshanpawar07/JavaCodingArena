package Exam;

import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 99, 2, 11, 23, 45 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the element to search :");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();

		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			if (arr[i] == key) {
				System.out.println("Key is found at " + i);
				return;
			} else if (arr[j] == key) {
				System.out.println("Key is found at " + j);
				return;
			}
		}
		System.out.println("Key is not found.");
	}

}

package Exam;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int low = 0, high = arr.length - 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the to search : ");
		int key = sc.nextInt();

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				System.out.println("Key is found at " + mid);
				return;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println("Key is not found.");
	}

}

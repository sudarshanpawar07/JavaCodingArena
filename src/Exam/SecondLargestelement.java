package Exam;

import java.util.*;

public class SecondLargestelement {
	public static void main(String[] args) {
		int[] arr = { 10, 45, 32, 89, 76, 88 };
		int max1 = Integer.MIN_VALUE;
		int max2 = 0;
		for (int ele : arr) {
			if (max1 < ele) {
				max2 = max1;
				max1 = ele;

			} else if (ele < max1 && ele > max2) {
				max2 = ele;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Max element is " + max2);
	}

}

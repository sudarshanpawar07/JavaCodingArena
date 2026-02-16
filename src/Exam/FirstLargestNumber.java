package Exam;

import java.util.Arrays;

public class FirstLargestNumber {
	public static void main(String[] args) {
		int[] arr = { 10, 45, 32, 89, 76 };
		int max = arr[0],min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
				
			}
			if(min > arr[i])
				min = arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Max Element in the Array : " + max);
		System.out.println("Min Element in the Array : " + min);

	}

}

package ArraysPractice;

import java.util.*;

public class AverageOfArrayElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Array :  " + Arrays.toString(arr));

		System.out.println("Average of Array Elements is : " + averageOfArrayElements(arr));

	}

	public static int averageOfArrayElements(int[] arr) {
		int sum = 0, avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		return avg;

	}

}

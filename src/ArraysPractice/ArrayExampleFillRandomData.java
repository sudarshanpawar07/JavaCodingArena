package ArraysPractice;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayExampleFillRandomData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.print("Enter the elements : ");
		for (int i = 0; i < size; i++) {
			int randomValue = (int) (Math.random() * 100);
			if (randomValue < 10) {
				i--;
				continue;
			}
			arr[i] = randomValue;
		}
		System.out.println("Before : " + Arrays.toString(arr));

	}

}

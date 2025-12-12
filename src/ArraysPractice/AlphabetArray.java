package ArraysPractice;

import java.util.Arrays;

public class AlphabetArray {

	public static void main(String[] args) {

		char[] arr = new char[26];
		System.out.println("Before : " + Arrays.toString(arr));

		for (char i = 'A'; i <= 'Z'; i++) {
			arr[i - 65] = i;
		}

		System.out.println("After : " + Arrays.toString(arr));

	}

}

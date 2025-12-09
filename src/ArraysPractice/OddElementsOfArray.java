package ArraysPractice;

public class OddElementsOfArray {

	public static void main(String[] args) {

		int[] arr = { 10, 33, 79, 32, 89, 57, 11 };

		System.out.print("Odd Elements Of an Array : ");
		for (int ele : arr) {
			if (ele % 2 != 0) {
				System.out.print(ele + " ");
			}
		}

	}

}

package ArraysPractice;

public class EvenElementOfArray {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 47, 58 };

		System.out.print("Even Elements Of an Array : ");
		for (int ele : arr) {

			if (ele % 2 == 0) {
				System.out.print(ele + " ");
			}
		}

	}

}

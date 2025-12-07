package ArraysPractice;

public class FindLengthOfArrWithoutLengthVar1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 6, 87, 23, 974, 908 };
		int len = 0;
		for (int i = 0;; i++) {
			try {
				System.out.print(arr[i] + " ");
				len++;
			} catch (ArrayIndexOutOfBoundsException e) {
				break;
			}

		}
		System.out.println();
		System.out.println("Length of the array : " + len);
	}

}

package ArraysPractice;

public class BackwardTraversingUsingForLoop {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 37, 766, 23, 55, 76 };
		System.out.print("Array Elements : ");
		for (int i = arr.length - 1; i > 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}

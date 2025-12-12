package ArraysPractice;

public class ForwardTraversingUsingWhileLoop {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 37, 766, 23, 55, 76 };
		int i = 0;

		System.out.print("Array Elements : ");
		while (i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}

}

package ArraysPractice;

public class DisplayArrUsingForEach {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8 };

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Length of Array : " + arr.length);
	}

}

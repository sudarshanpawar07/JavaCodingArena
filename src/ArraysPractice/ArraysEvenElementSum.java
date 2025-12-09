package ArraysPractice;

public class ArraysEvenElementSum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 67, 98, 90, 75, 38, 63, 78 };

		int evenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenSum += arr[i];
			}
		}
		System.out.println("Even Elements sum : " + evenSum);
	}

}

package ArraysPractice;

public class EvenSumAndOddSumOfArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 37, 766, 23, 55, 76 };
		int evenSum = 0, oddSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenSum += arr[i];
			if (arr[i] % 2 != 0)
				oddSum += arr[i];
		}
		System.out.println(" Sum of odd elemets : " + oddSum);
		System.out.println(" Sum of odd elemets : " + evenSum);

	}

}

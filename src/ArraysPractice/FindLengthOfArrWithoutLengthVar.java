package ArraysPractice;

public class FindLengthOfArrWithoutLengthVar {
	public static void main(String[] args) {
		int arr[] = { 10, 309, 23, 54, 65, 87, 98, 1008, 54, 353 };
		int len = 0;
		for (int ele : arr) {
			len++;
		}
		System.out.println("Length of the Array is : " + len);
	}

}

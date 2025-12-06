package ExceptionHandling;

public class UserArrayIndexOutOfBoundsExceptionDriver {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		for (int i = 0; i <= arr.length; i++) {
			if (i >= arr.length) {
				new UserArrayIndexOutOfBoundsException(" Index " + i + "out of bounds for length " + arr.length);
			}
			System.out.println(arr[i]);
		}

	}

}

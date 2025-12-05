package ExceptionHandling;

import java.util.*;

class UserInputMismatchException extends RuntimeException {
	UserInputMismatchException() {
		super();
	}

}

class UserScanner {
	UserScanner(Object obj) {
		super();
	}

	public int UserNextInt() {
		String value = new Scanner(System.in).next();
		Integer num = null;
		try {
			num = Integer.parseInt(value);
		} catch (NumberFormatException nfe) {
			throw new UserInputMismatchException();
		}
		return num;
	}
}

class UserScannerDriver {
	public static void main(String[] args) {
		UserScanner sc = new UserScanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.UserNextInt();

		System.out.println("Number : " + num);

		int num1 = new Scanner(System.in).nextInt();
		System.out.println("Number : " + num1);
	}
}

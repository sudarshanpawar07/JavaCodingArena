package Methods;

public class Reverse {
	public static void main(String[] args) {
		System.out.println("Reverse is : "+reverse(1234));

	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		return rev;
	}

}

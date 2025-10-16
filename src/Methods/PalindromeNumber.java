package Methods;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		int num  = 1221;
		if(num == reverse(num))
		{
			System.out.println("It is Palindrome ");
		}
		else {
			System.out.println("It is not Palindrome");
		}
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
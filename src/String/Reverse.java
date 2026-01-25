package String;

public class Reverse {
	public static void main(String[] args) {
		String str = "naman";
		boolean flag = false;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {

			if (str.charAt(i) != str.charAt(j)){
				flag = true;
				break;
			}
		}

		if (flag){
			System.out.println("String is not palindrome .");
		} else {
			System.out.println("String is Palindrome .");
		}
	}

}

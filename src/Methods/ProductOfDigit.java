package Methods;

public class ProductOfDigit {
	public static void main(String[] args) {
		System.out.println("Produc of digit is : " + productOfDigit(1234));
	}

	public static int productOfDigit(int num) {
		int pro = 1;

		while (num != 0) {
			pro *= (num % 10);
			num /= 10;
		}
		return pro;
	}

}

package pattern;
import java.util.Scanner;

public class Pattern30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= i; j++) {
				System.out.print((char) (64 + j));
			}
			System.out.println();
		}
	}

}

package BasicLoopsPrograms;

import java.util.Scanner;

public class EvilNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int dup = num;
		sc.close();
		String bin = "";
		for (int i = num; i > 0; i /= 2) {
			bin = (i % 2) + bin;
		}
//		System.out.println(bin);
		int cnt = 0;
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '1') {
				cnt++;
			}
		}

		if (cnt % 2 == 0)
			System.out.println(dup + " is Evil Number.");
		else
			System.out.println(dup + " is Not a Evil  Number.");
	}

}

package Programming;

import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks : ");
		float mark = sc.nextFloat();
		float per = (mark * 100) / 600;
		sc.close();
		System.out.println((per >= 75) ? "Grade A with " + per + " %"
				: (per >= 60) ? "Grade B with " + per + " %" : (per >= 35) ? "Grade C with " + per + " %" : "Fail");

	}

}

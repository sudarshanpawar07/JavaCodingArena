package BasicLoopsPrograms;

public class FacinatingNumber {
	public static void main(String[] args) {
		int num = 327;
		int temp = num;
		boolean flag = true;

		// Concatenation logic
		int concat = num;
		for (int i = 2; i <= 3; i++) {
			concat = (concat * 1000) + (temp * i);
		}

		System.out.println(concat);

		// Digit checking logic
		for (int i = 1; i <= 9; i++) {
			int cnt = 0;
			for (int j = concat; j > 0; j /= 10) {
				int rem = j % 10;
				if (rem == i) {
					cnt++;
				}
			}
			if (cnt != 1) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println(temp + " is Fascinating Number.");
		else
			System.out.println(temp + " is NOT Fascinating Number.");
	}
}

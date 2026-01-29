package BasicLoopsPrograms;
import java.util.Scanner;

public class GoodPrimeCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 2; i <= num; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}

				if (flag) {
					for (int k = i; k > 0; k /= 10) {
						int rem = k % 10;
						if (rem == 1) {
							flag = false;
							break;
						}

						for (int j1 = 2; j1 <= rem / 2; j1++){
							if (rem % j1 == 0) {
								flag = false;
								break;

							}

						}
					}
				}

				if (flag) {
					System.out.println(i);
					cnt++;
				}
			}

		}
		System.out.println("Good Prime Before : " + cnt);

	}

}

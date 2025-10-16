package pattern;
public class Pattern20 {
	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <= n; i++) {
			int num = i;
			System.out.print(num + " ");

			for (int j = 1; j < n; j++) {
				num += n;

				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
/*
 
1 5 9 13 
2 6 10 14 
3 7 11 15 
4 8 12 16 

*/
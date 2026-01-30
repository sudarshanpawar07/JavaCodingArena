package BasicLoopsPrograms;

public class Triangle9 {
	public static void main(String[] args) {
		int n = 5;
		char ch = 'a';
		int a = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (i % 2 != 0)
					System.out.print(ch++ + " ");
				else
					System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}
}

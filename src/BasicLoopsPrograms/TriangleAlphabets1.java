package BasicLoopsPrograms;

public class TriangleAlphabets1 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i < n; i++) {
			char ch = 'a';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

}

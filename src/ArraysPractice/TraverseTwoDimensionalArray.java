package ArraysPractice;

public class TraverseTwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 40, 50 }, { 60, 70, 80 } };

		System.out.println("Display Using For loop : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("display using while loop : ");
		int i = 0;
		while (i < arr.length) {
			int j = 0;
			while (j < arr[i].length) {
				System.out.print(arr[i][j] + " ");
				j++;
			}
			i++;
			System.out.println();
		}

		System.out.println("Display using do While loop : ");
		int k = 0;

		do {
			int l = 0;
			do {
				System.out.print(arr[k][l] + " ");
				l++;
			} while (l < arr[k].length);
			k++;
			System.out.println();
		} while (k < arr.length);

	}

}

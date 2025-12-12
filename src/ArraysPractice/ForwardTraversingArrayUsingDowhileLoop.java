package ArraysPractice;

public class ForwardTraversingArrayUsingDowhileLoop {

	public static void main(String[] args) {
		int [] arr = {10,20,37,766,23,55,76};
		int i= 0;
		do {
			System.out.print(arr[i] + " ");
			i++;
		}while(i< arr.length);

	}

}

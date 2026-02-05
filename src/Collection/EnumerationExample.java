package Collection;
import java.util.LinkedList;

public class EnumerationExample {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++) {
			list.add((int) (Math.random() * 100));
		}
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			Integer ele = list.get(i);
			if (ele % 2 != 0) {
				list.remove(i);
				i--;
			}

		}
		System.out.println(list);
	}

}

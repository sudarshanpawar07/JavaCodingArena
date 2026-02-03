package Collection;

import java.util.LinkedList;

public class Example {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("java");
		list.add("is");
		list.add("easy");
		System.out.println(list);
		boolean data = list.contains("easy");
		System.out.println(data);
	}
}

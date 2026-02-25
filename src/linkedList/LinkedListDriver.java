package linkedList;

public class LinkedListDriver {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(list.get(1));
		
	}

}

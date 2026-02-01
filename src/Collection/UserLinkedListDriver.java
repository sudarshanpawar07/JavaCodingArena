package Collection;

import java.util.LinkedList;

public class UserLinkedListDriver {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
//		System.out.println(list.isEmpty());
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
		list.addFirst(40000);
		list.addLast(600000);
		System.out.println(list);
		System.out.println("---------------------------------");
		
		UserLinkedList<Integer> list1 = new UserLinkedList<Integer>();
//		System.out.println(list1.isEmpty());
//		list1.add(10);
//		list1.add(20);
//		list1.add(30);
//		list1.add(40);
//		list1.add(50);
		list1.addFirst(40000);
		list1.addLast(600000);
		System.out.println(list1);
		

	}

}

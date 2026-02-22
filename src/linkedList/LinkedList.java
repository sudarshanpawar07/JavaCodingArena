package linkedList;

public class LinkedList<E> {
	int index;
	Node<E> head;
	Node<E> tail;

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {

		return "[" + head + " ," + tail + "]";
	}

	public boolean add(E ele) {
		if (head == null) {
			head = new Node(null, null, ele, 0);
			index++;
			tail = head;
			return true;
		} else {
			tail.next = new Node<E>(tail, null, ele, index);
			tail = tail.next;
			index++;
			return true;
		}
	}

}

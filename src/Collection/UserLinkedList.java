package Collection;

class UserNoSuchElementException extends RuntimeException {
	public UserNoSuchElementException() {
		super();
	}
}

public class UserLinkedList<E> {
	private int indx;
	private Node<E> head;
	private Node<E> tail;

	private class Node<E> {
		E ele;
		Node<E> next;

		public Node(E ele) {
			this.ele = ele;
		}
	}

	public boolean add(E ele) {
		Node<E> newNode = new Node<E>(ele);
		if (indx == 0) {
			head = newNode;
			tail = head;
			indx++;
		} else {
			tail.next = newNode;
			tail = newNode;
			indx++;
		}
		return true;
	}

	@Override
	public String toString() {
		if (indx == 0)
			return "[]";
		Node<E> currentEle = head;
		String resp = "[";
		while (currentEle.next != null) {
			resp += currentEle.ele + ", ";
			currentEle = currentEle.next;

		}
		resp += currentEle.ele + "]";
		return resp;
	}

	public int size() {
		return indx;
	}

	public void addLast(E ele) {
		add(ele);
	}

	public void addFirst(E ele) {
		Node<E> newNode = new Node<E>(ele);
		newNode.next = head;
		head = newNode;
		indx++;

	}

	public E getFirst() {
		if (size() == 0)
			throw new UserNoSuchElementException();
		return head.ele;
	}

	public E getLast() {
		if (size() == 0)
			throw new UserNoSuchElementException();
		return tail.ele;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
}

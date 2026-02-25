package linkedList;

import java.util.Objects;

public class Node<E> {
	Node<E> prev;
	Node<E> next;
	E val;
	

	private Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(Node<E> prev, Node<E> next, E val) {
		super();
		this.prev = prev;
		this.next = next;
		this.val = val;
	}

	@Override
	public String toString() {
		return "" + val;
	}

	@Override
	public int hashCode() {
		return Objects.hash(val);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node<E> other = (Node<E>) obj;
		return Objects.equals(val, other.val);
	}

}

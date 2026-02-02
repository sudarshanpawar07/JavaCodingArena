package Collection;

class UserNoSuchElementException extends RuntimeException {
	public UserNoSuchElementException() {
		super();
	}
}

class UserIndexOutOfBooundsException extends RuntimeException {
	public UserIndexOutOfBooundsException(String desc) {
		super(desc);
	}
}

public class UserLinkedList<E> {
	private int indx;
	private Node<E> head;
	private Node<E> tail;
	private UserLinkedList<E>.Node<E> curr;

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
		Node<E> newNode = new Node<E>(ele);
		if (head == null) {
			head = tail = newNode;
		} else {
			Node<E> curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
		indx++;
	}

	public void addFirst(E ele) {
		Node<E> newNode = new Node<E>(ele);
		if (indx == 0) {
			head = newNode;
			tail = head;
			indx++;
		} else {
			newNode.next = head;
			head = newNode;
			indx++;
		}
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

	public E removeLast() {
		if (size() == 0)
			throw new UserNoSuchElementException();
		E temp = tail.ele;
		Node<E> curr = head;
		for (int i = 0; i < size() - 2; i++) {
			curr = curr.next;
		}
		tail = curr;
		curr.next = null;
		indx--;
		return temp;
	}

	public void add(int indx, E ele) {
		if (indx < 0 || indx > size())
			throw new UserIndexOutOfBooundsException("index : " + indx + " size : " + size());
		Node<E> newNode = new Node<E>(ele);
		Node<E> curr1 = head;

		for (int i = 0; i < indx - 1; i++) {
			curr1 = curr1.next;
		}
		Node<E> curr2 = curr1.next;
		curr1.next = newNode;
		newNode.next = curr2;
		this.indx++;
	}

	public E remove(int indx) {
		if (indx < 0 || indx > size())
			throw new UserIndexOutOfBooundsException("index : " + indx + " size : " + size());
		Node<E> curr1 = head;
		for (int i = 0; i < indx - 1; i++) {
			curr1 = curr1.next;
		}
		Node<E> curr2 = curr1.next;
		curr1.next = curr2.next;
		E temp = curr2.ele;
		curr2.next = null;
		this.indx--;

		return temp;
	}

	public boolean contains(Object obj) {
		E search = (E) obj;
		if (search.equals(getLast()))
			return true;
		Node<E> curr = head;
		while (curr.next != null) {
			if (curr.ele.equals(search))
				return true;
			curr = curr.next;
		}

		return false;
	}

	public int indexOf(Object obj) {
		E search = (E) obj;
		if (!contains(obj))
			return -1;
		Node<E> curr = head;
		int i = 0;
		while (curr.next != null) {
			if (curr.ele.equals(search))
				return i;
			i++;
			curr = curr.next;

		}
		if (search.equals(getLast()))
			return size() - 1;
		return -1;
	}

	public E remove() {
		return removeLast();
	}

	public void clear() {
		while (!isEmpty())
			removeFirst();
	}

	public E removeFirst() {
		if (size() == 0)
			throw new UserNoSuchElementException();
		E temp = head.ele;
		Node<E> curr = head;
		head = curr.next;
		curr.next = null;
		indx--;
		return temp;

	}

	public void addAll(UserLinkedList<E> list) {
		UserLinkedList<E> list2 = new UserLinkedList<E>();
		for (int i = 1; i < size(); i++) {
			list2.add(list.get(i));
		}
		while (!list2.isEmpty()) {
			E ele = (E) list2.getFirst();
			this.addLast(ele);
			list2.removeFirst();
		}
	}

	public E get(int indx) {
		if (indx < 0 || indx >= size())
			throw new UserIndexOutOfBooundsException("index : " + indx + " size : " + size());
		if (indx == size() - 1)
			return getLast();
		int i = 1;
		Node<E> curr = head;
		while (curr.next != null) {
			if (i == indx)
				return curr.ele;
			i++;
			curr = curr.next;
		}
		return null;
	}
}

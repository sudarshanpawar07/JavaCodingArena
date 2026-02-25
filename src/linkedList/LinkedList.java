package linkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> {
	int index;
	Node<E> head;
	Node<E> tail;
	private Node<E> curr;

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("[");

		Iterator<E> itr = iterator();
		int indx = 0;
		while (itr.hasNext()) {
			if (indx < index - 1) {
				sb = sb.append(itr.next() + " , ");
			} else {
				sb = sb.append(itr.next() + "");
			}
			indx++;
		}
		sb = sb.append("]");
		return sb.toString();

	}

	public boolean add(E ele) {
		if (head == null) {
			head = new Node(null, null, ele);

			tail = head;
			curr = head;
			index++;
			return true;
		} else {
			tail.next = new Node<E>(tail, null, ele);
			tail = tail.next;
			index++;
			return true;
		}
	}

	public int size() {
		return index;
	}

	public void clear() {
		head = null;
		tail = null;
		index = 0;
	}

	public boolean isEmpty() {
		return index == 0;
	}

	public boolean retainAll(LinkedList<E> list) {
		int mod = index;
		Iterator<E> itr = iterator();
		while (itr.hasNext()) {
			E temp = itr.next();
			if (!list.contains(temp)) {
				remove(temp);
			}
		}
		return mod != index;
	}

	public boolean addAll(LinkedList<E> list) {
		return addAll(index, list);
	}

	public boolean removeAll(LinkedList<E> list) {
		int temp = index;
		Iterator<E> itr = iterator();
		while (itr.hasNext()) {
			remove(itr.next());
		}
		return temp != index;
	}

	public int indexOf(E ele) {
		int indx = 0;
		Iterator<E> itr = iterator();
		while (itr.hasNext()) {
			if (itr.next().equals(ele)) {
				return indx;
			}
			indx++;
		}
		return -1;
	}

	public boolean containsAll(LinkedList<E> list) {
		Iterator<E> itr = list.iterator();
		while (itr.hasNext()) {
			if (!contains(itr.next())) {
				return false;
			}
		}
		return true;
	}

	public boolean contains(E ele) {
		Iterator<E> itr = iterator();
		while (itr.hasNext()) {
			if (itr.next().equals(ele)) {
				return true;
			}
		}
		return false;

	}

//	public boolean addAll(LinkedList<E> list) {
//
//		return addAll(index, list);
//	}

	public boolean addAll(int index, LinkedList<E> list) {
		Iterator<E> itr = list.iterator();
		while (itr.hasNext()) {
			add(index, itr.next());
			index++;
		}
		return true;
	}

	public boolean add(int index, E ele) {
		if (index < 0 || index > this.index) {
			return false;
		} else {
			if (index == 0) {
				Node<E> temp = new Node<E>(null, head, ele);
				head.prev = temp;
				head = temp;
				this.index++;
				curr = head;
				return true;
			} else if (index == this.index) {
				return add(ele);
			} else {
				Node<E> temp = null;
				for (int i = 0; i < index; i++) {
					temp = nextRef();
				}

				Node<E> newNode = new Node<E>(temp, temp.next, ele);
				temp.next = newNode;
				newNode.next.prev = newNode;
				this.index++;
				curr = head;
				return true;

			}
		}
	}

	public boolean remove(E ele) {
		if (head != null) {
			if (head.val.equals(ele)) {
				if (head.next != null) {
					head = head.next;
					head.prev = null;
				} else {
					head = null;
				}
				index--;
				return true;
			} else if (tail.val.equals(ele)) {
				tail = tail.prev;
				tail.next = null;
				index--;
				return true;
			} else {
				while (hasNextRef()) {
					Node<E> ref = nextRef();
					if (ref.val.equals(ele)) {
						Node<E> temp = ref.prev;
						ref.prev.next = ref.next;

						ref.next.prev = temp;
						index--;
						return true;
					}
				}
				return false;
			}
		}
		return false;
	}

	public E get(int index) {
		if (index >= 0 && index < this.index) {
			Iterator<E> itr = iterator();
			int indx = 0;
			E temp = null;
			while (itr.hasNext()) {
				temp = itr.next();
				if (index == indx) {
					break;
				}
				indx++;
			}

			return temp;
		}
		throw new IndexOutOfBoundsException();

	}

	public Iterator<E> iterator() {
		curr = head;
		return new Itr<E>();
	}

	private Node<E> nextRef() {
		Node<E> temp = curr;
		curr = curr.next;
		return temp;
	}

	private boolean hasNextRef() {
		return curr != null;
	}

	public class Itr<T> implements Iterator {
		public boolean hasNext() {
			return curr != null;
		}

		public E next() {
			Node<E> temp = curr;
			curr = curr.next;
			if (temp != null) {
				return temp.val;
			}
			throw new NoSuchElementException("No More Elements in the List.");

		}
	}
}

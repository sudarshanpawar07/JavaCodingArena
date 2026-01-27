package Collection;

import java.util.*;

class UserSuchNoException extends RuntimeException {
	public UserSuchNoException() {
		super();
	}
}
class UserIllegalArgumentException extends RuntimeException {
	public UserIllegalArgumentException(String desc) {
		super(desc);

	}
}

class UserIndexOutOfBoundsException extends RuntimeException {
	public UserIndexOutOfBoundsException(String desc) {
		super(desc);
	}
}

class UserArrayList<E> implements Cloneable {
	private final int INITIAL_CAPACITY = 10;
	private E[] arr;
	private int indx;

	public UserArrayList() {
		arr = (E[]) new Object[INITIAL_CAPACITY];
	}

	public UserArrayList(int cap) {

		if (cap < 0) {
			throw new UserIllegalArgumentException("Illegal Capacity: " + cap);
		}

		arr = (E[]) new Object[cap];
		indx = 0;
	}

	public String toString() {
		if (indx == 0)
			return "[]";
		String op = "[";
		for (int i = 0; i < indx - 1; i++) {
			op += arr[i] + ", ";
		}
		op += arr[indx - 1] + "]";
		return op;
	}

	public boolean add(E ele) {
		if (indx == arr.length) {

			int newCap = newCapacity(arr.length);
			E[] newArr = (E[]) new Object[newCap];
			int i = 0;
			for (E ele1 : arr) {
				newArr[i++] = ele1;
			}
			arr = newArr;
		}
		arr[indx++] = ele;
		return true;
	}

	public E getFirst() {
		if (size() == 0) {
			throw new UserSuchNoException();

		}
		return arr[0];
	}

	public E getLast() {
		if (size() == 0) {
			throw new UserSuchNoException();

		}
		return arr[indx - 1];
	}

	private int newCapacity(int oldCap) {

		return (int) (oldCap * 1.5);
	}

	public int size() {
		return indx;
	}

	public boolean isEmpty() {
		return indx == 0;
	}

	public int indexOf(Object obj) {
		for (int i = 0; i < size(); i++) {
			if (arr[i].equals((E) obj)) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(Object obj) {
		for (int i = size() - 1; i >= 0; i--) {
			if (arr[i].equals((E) obj)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(Object obj) {

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].equals((E)obj)) {
//				return true;
//			}
//		}
		return indexOf(obj) != 1;
	}

	public E removeLast() {
		return remove(size() - 1);
	}

	public E removeFirst() {
		return remove(0);
	}

	public E remove(int indx) {

		if (indx < 0 || indx >= size())
			throw new UserIndexOutOfBoundsException("Index " + indx + " out of bounds for length " + size());
		E temp = arr[indx];
		for (int i = indx + 1; i <= size() - 1; i++) {
			arr[i - 1] = arr[i];

			arr[size() - 1] = null;
			this.indx--;

		}

		return temp;
	}

	public void addFirst(E ele) {
		add(0, ele);
	}

	public void addLast(E ele) {
		add(size() - 1, ele);
	}

	public void add(int indx, E ele) {
		if (indx < 0 || indx >= size())
			throw new UserIndexOutOfBoundsException("Index " + indx + " out of bounds for length " + size());
		if (arr.length == size()) {
			E[] newArr = (E[]) new Object[newCapacity(arr.length)];
			int i = 0;
			int ni = 0;
			while (i < indx) {
				newArr[ni++] = arr[i++];
			}
			newArr[ni++] = ele;
			while (i < size()) {
				newArr[ni++] = arr[i++];
			}
			this.indx++;
			arr = newArr;
			return;
		}
		for (int i = size() - 1; i >= indx; i--) {
			arr[i + 1] = arr[i];
		}
		arr[indx] = ele;
		this.indx++;
	}

	public E set(int indx, E ele) {
		if (indx < 0 || indx >= size())
			throw new UserIndexOutOfBoundsException("Index " + indx + " out of bounds for length " + size());
		E temp = arr[indx];
		arr[indx] = ele;
		return temp;
	}

	public void trimToSize() {
		if (arr.length == size())
			return;
		E[] newArr = (E[]) new Object[size()];
		for (int i = 0; i < size(); i++) {
			newArr[i] = this.arr[i];
		}
		arr = newArr;
	}

	public void ensureCapacity(int cap) {
		if (arr.length >= cap)
			return;
		E[] newArr = (E[]) new Object[cap];
		for (int i = 0; i < size(); i++) {
			newArr[i] = this.arr[i];
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Object[] toArray() {
		Object[] newArr = new Object[size()];
		for (int i = 0; i < size(); i++) {
			newArr[i] = this.arr[i];
		}
		return newArr;
	}

	public E get(int indx) {
		if (indx < 0 || indx >= size())
			throw new UserIndexOutOfBoundsException("Index " + indx + " out of bounds for length " + size());
		return arr[indx];
	}

	public int hashCode() {
		int i = 0;
		int hashCode = 1;
		for (E ele : this.arr) {
			hashCode *= ele.hashCode();
			if (++i == size())
				break;
		}
		return hashCode;
	}

	public boolean equals(Object obj) {
		E ele = (E) obj;
		if (this.hashCode() == ele.hashCode())
			return true;
		return false;
	}

	public void clear() {
		E[] newArr = (E[]) new Object[this.arr.length];
		this.indx = 0;
		arr = newArr;
	}

	public boolean addAll(UserArrayList<Integer> clone) {
		
		return true;
	}
}

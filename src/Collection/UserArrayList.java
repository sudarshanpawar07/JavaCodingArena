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

class UserArrayList<E> {
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
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(Object obj) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(Object obj) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == obj) {
				return true;
			}
		}
		return false;
	}
}

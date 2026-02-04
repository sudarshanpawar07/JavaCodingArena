package Collection;

class UserEmptyStackException extends RuntimeException {

}

public class UserStack<E> {
	private final int INITIAL_CAPACITY = 10;
	private E[] arr;
	private int indx;

	public UserStack() {
		arr = (E[]) new Object[INITIAL_CAPACITY];
	}

	@Override
	public String toString() {
		if (indx == 0)
			return "[]";
		String op = "[";
		for (int i = 0; i < indx - 1; i++) {
			op += arr[i] + " , ";
		}
		return op + arr[indx - 1] + "]";
	}

	public E push(E ele) {
		if (indx == arr.length) {
			E[] newArr = (E[]) new Object[arr.length * 2];

			for (int i = 0; i < arr.length; i++) {
				newArr[i] = this.arr[i];
			}
			arr = newArr;
		}
		arr[indx++] = ele;
		return ele;
	}

	public E pop() {
		if (indx == 0)
			throw new UserEmptyStackException();
		E temp = arr[indx - 1];
		arr[indx - 1] = null;
		indx--;
		return temp;
	}

	public E peek() {
		if (indx == 0)
			throw new UserEmptyStackException();
		return arr[indx - 1];
	}

	public boolean empty() {
		return indx == 0;
	}

	public int search(Object obj) {
		E search = (E) obj;
		int offSet = 1;
		for (int i = indx - 1; i >= 0; i--, offSet++) {
			if (arr[i].equals(search))
				return offSet;
		}
		return -1;
	}
}

package String;

import java.io.Serializable;

/* Custom Runtime Exception */
class UserStringIndexOutOfBoundsException extends RuntimeException implements Serializable {
	public UserStringIndexOutOfBoundsException(String description) {
		super(description);
	}
}

/* Custom String Class */
public final class UserString {

	private char[] arr;
	private int indx = 0;

	/* Default Constructor */
	public UserString() {
		arr = new char[0];
	}

	/* StringBuilder Constructor */
	public UserString(StringBuilder sb) {
		this(sb.toString());
	}

	/* StringBuffer Constructor */
	public UserString(StringBuffer sb) {
		this(sb.toString());
	}

	/* String Constructor */
	public UserString(String str) {
		arr = new char[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[indx++] = str.charAt(i);
		}
	}

	/* byte[] Constructor */
	public UserString(byte[] arr) {
		this(arr, 0, arr.length);
	}

	/* byte[] with offset & count */
	public UserString(byte[] arr, int offset, int count) {
		if (offset + count > arr.length) {
			throw new UserStringIndexOutOfBoundsException("index out of bounds");
		}

		this.arr = new char[count];
		for (int i = offset, j = 0; i < offset + count; i++) {
			this.arr[j++] = (char) arr[i];
		}
	}

	/* char[] with offset & count */
	public UserString(char[] arr, int offset, int count) {
		if (offset + count > arr.length) {
			throw new UserStringIndexOutOfBoundsException("index out of bounds");
		}

		this.arr = new char[count];
		for (int i = offset, j = 0; i < offset + count; i++) {
			this.arr[j++] = arr[i];
		}
	}

	public UserString(int[] arr, int offset, int count) {
		if ((offset + count) > arr.length) {
			throw new UserStringIndexOutOfBoundsException("index out of bounds");
		}

		this.arr = new char[count];

		for (int i = offset, j = 0; i < (offset + count); i++) {
			this.arr[j++] = (char) arr[i];
		}
	}

	/* char[] Constructor */
	public UserString(char[] arr) {
		this(arr, 0, arr.length);
	}

	/* Length Method */
	public int length() {
		return arr.length;
	}

	/* toString Override */
	@Override
	public String toString() {
		if (arr.length == 0)
			return "";

		String output = "";
		for (char ele : arr) {
			output += ele;
		}
		return output;
	}
}
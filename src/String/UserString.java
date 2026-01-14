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

	public char charAt(int indx) {
		if (indx < 0 || indx > arr.length - 1) {
			throw new UserStringIndexOutOfBoundsException("Invalid indx ..!");
		}
		return this.arr[indx];
	}

	public UserString concat(UserString str) {

		char[] newArr = new char[this.arr.length + str.length()];
		int indx = 0;
		for (char ele : this.arr)
			newArr[indx++] = ele;
		for (int i = 0; i < str.length(); i++) {
			newArr[indx++] = str.charAt(i);
		}
		return new UserString(newArr);
	}

	public UserString toUpperCase() {
//		UserString newStr = new UserString();
		char[] newArr = new char[this.arr.length];

		int indx = 0;
		for (char ele : this.arr)
			newArr[indx++] = ele;
		int indx1 = 0;
		for (char ele : newArr) {
			if (ele >= 97 && ele <= 122) {
				newArr[indx1] = (char) (ele - 32);
			}
			indx1++;
		}
		return new UserString(newArr);
	}

	public UserString toLowerCase() {

		char[] newArr = new char[this.arr.length];

		int indx = 0;
		for (char ele : this.arr)
			newArr[indx++] = ele;

		int indx1 = 0;
		for (char ele : newArr) {
			if (ele >= 65 && ele <= 90) {
				newArr[indx1] = (char) (ele + 32);
			}
			indx1++;
		}
		return new UserString(newArr);
	}

	public int codePointAt(int indx) {
		if (indx < 0 || indx > arr.length - 1) {
			throw new UserStringIndexOutOfBoundsException("Invalid indx ..!");
		}

		return this.arr[indx] + 0;
	}

	public int codePointBefore(int indx) {
		if (indx <= 0 || indx > arr.length) {
			throw new UserStringIndexOutOfBoundsException("Invalid indx ..!");
		}

		return this.arr[indx - 1] + 0;
	}

	@Override
	public boolean equals(Object obj) {
		UserString str = (UserString) obj;
		if (str.length() != this.length())
			return false;

		for (int i = 0; i < str.length(); i++) {
			if (this.charAt(i) != str.charAt(i)) {
				return false;
			}

		}

		return true;
	}

	public boolean equalsIgnoreCase(UserString comp) {
		return comp.toUpperCase().equals(this.toUpperCase());
	}

	public boolean isEmpty() {
		return this.length() == 0;
	}

	public char[] toCharArray() {
		char[] newArr = new char[this.arr.length];
		int indx = 0;
		for (char ele : this.arr)
			newArr[indx++] = ele;
		return newArr;
	}

}
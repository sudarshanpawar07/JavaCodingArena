package String;

/* Custom Runtime Exception */
class UserStringIndexOutOfBoundsException extends RuntimeException {
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

	/* int[] Constructor */
	public UserString(int[] arr, int offset, int count) {
		if (offset + count > arr.length) {
			throw new UserStringIndexOutOfBoundsException("index out of bounds");
		}

		this.arr = new char[count];
		for (int i = offset, j = 0; i < offset + count; i++) {
			this.arr[j++] = (char) arr[i];
		}
	}

	/* char[] Constructor */
	public UserString(char[] arr) {
		this(arr, 0, arr.length);
	}

	/* Length */
	public int length() {
		return arr.length;
	}

	/* toString */
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

	/* charAt */
	public char charAt(int indx) {
		if (indx < 0 || indx > arr.length - 1) {
			throw new UserStringIndexOutOfBoundsException("Invalid index");
		}
		return this.arr[indx];
	}

	/* concat */
	public UserString concat(UserString str) {
		char[] newArr = new char[this.arr.length + str.length()];
		int i = 0;

		for (char ch : this.arr)
			newArr[i++] = ch;

		for (int j = 0; j < str.length(); j++)
			newArr[i++] = str.charAt(j);

		return new UserString(newArr);
	}

	/* toUpperCase */
	public UserString toUpperCase() {
		char[] newArr = new char[this.arr.length];

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (ch >= 97 && ch <= 122)
				newArr[i] = (char) (ch - 32);
			else
				newArr[i] = ch;
		}
		return new UserString(newArr);
	}

	/* toLowerCase */
	public UserString toLowerCase() {
		char[] newArr = new char[this.arr.length];

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (ch >= 65 && ch <= 90)
				newArr[i] = (char) (ch + 32);
			else
				newArr[i] = ch;
		}
		return new UserString(newArr);
	}

	/* codePointAt */
	public int codePointAt(int indx) {
		if (indx < 0 || indx > arr.length - 1) {
			throw new UserStringIndexOutOfBoundsException("Invalid index");
		}
		return this.arr[indx];
	}

	/* codePointBefore */
	public int codePointBefore(int indx) {
		if (indx <= 0 || indx > arr.length) {
			throw new UserStringIndexOutOfBoundsException("Invalid index");
		}
		return this.arr[indx - 1];
	}

	/* equals */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof UserString))
			return false;

		UserString str = (UserString) obj;
		if (str.length() != this.length())
			return false;

		for (int i = 0; i < str.length(); i++) {
			if (this.arr[i] != str.arr[i])
				return false;
		}
		return true;
	}

	/* equalsIgnoreCase */
	public boolean equalsIgnoreCase(UserString comp) {
		return comp.toUpperCase().equals(this.toUpperCase());
	}

	/* isEmpty */
	public boolean isEmpty() {
		return this.length() == 0;
	}

	/* toCharArray */
	public char[] toCharArray() {
		char[] newArr = new char[this.arr.length];
		for (int i = 0; i < arr.length; i++)
			newArr[i] = arr[i];
		return newArr;
	}

	/* startsWith */
	public boolean startsWith(UserString prefix) {
		if (prefix.length() > this.arr.length)
			return false;

		for (int i = 0; i < prefix.length(); i++) {
			if (this.arr[i] != prefix.arr[i])
				return false;
		}
		return true;
	}

	public boolean startsWith(UserString prefix, int indx) {
		if (indx < 0 || indx + prefix.length() > this.arr.length)
			return false;

		for (int i = 0, j = indx; i < prefix.length(); i++, j++) {
			if (this.arr[j] != prefix.charAt(i))
				return false;
		}
		return true;
	}

	/* substring */
	public UserString substring(int indx) {
		return substring(indx, arr.length);
	}

	public UserString substring(int start, int end) {
		if (start < 0 || start > arr.length || start > end)
			throw new UserStringIndexOutOfBoundsException("Invalid index");

		char[] newArr = new char[end - start];
		for (int i = start, j = 0; i < end; i++) {
			newArr[j++] = arr[i];
		}
		return new UserString(newArr);
	}

	/* trim */
	public UserString trim() {
		int i = 0, j = arr.length - 1;

		while (i < arr.length && arr[i] == ' ')
			i++;

		while (j >= i && arr[j] == ' ')
			j--;

		return substring(i, j + 1);
	}
}

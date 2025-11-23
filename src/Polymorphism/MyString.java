package Polymorphism;

public class MyString {
	String str;

	public MyString(String str) {
		this.str = str;
	}

	public String displayMyString() {
		return str;
	}

	public MyString concat(int data) {
		str = str + data;
		return this;
	}

	public MyString concat(double data) {
		str = str + data;
		return this;
	}

	public MyString concat(boolean data) {
		str = str + data;
		return this;
	}

}

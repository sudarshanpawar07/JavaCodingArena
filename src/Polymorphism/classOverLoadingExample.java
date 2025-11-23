package Polymorphism;

public class classOverLoadingExample {

	public static void main(String[] args) {
		MyString obj = new MyString("Hello");
		obj.concat(false);
		System.out.println(obj.displayMyString());
		obj.concat(10.30);
		System.out.println(obj.displayMyString());
		obj.concat(50);
		System.out.println(obj.displayMyString());
	}

}

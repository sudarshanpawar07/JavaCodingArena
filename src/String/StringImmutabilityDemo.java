package String;

public class StringImmutabilityDemo {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = s1; // s2 refers to the same object as s1

		System.out.println("Before change:");
		System.out.println("s1 = " + s1); // Java
		System.out.println("s2 = " + s2); // Java

		s1 = s1.concat(" Developer"); // creates a NEW String object

		System.out.println("\nAfter change:");
		System.out.println("s1 = " + s1); // Java Developer
		System.out.println("s2 = " + s2); // Java
	}
}

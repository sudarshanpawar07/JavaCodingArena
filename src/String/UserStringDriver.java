package String;

class UserStringDriver {

	public static void main(String[] args) {

		UserString str = new UserString("ABC");
		UserString str1 = new UserString("A");
		str = str.concat(str1);
		System.out.println("Str  : " + str.toLowerCase());
		System.out.println("Str : " + str.toUpperCase());
		System.out.println("CodePointAt : " + str.codePointAt(0));
		System.out.println("CodePointBefore : " + str.codePointBefore(2));
		UserString empty = new UserString();
		System.out.println(empty.isEmpty());
		System.out.println("start with : " + str.startsWith(str1));

	}
}
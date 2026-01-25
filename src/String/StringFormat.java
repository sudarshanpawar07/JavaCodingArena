package String;
public class StringFormat{
	public static void main(String[] args) {
		String str = "aaabbbcccdefghikkkkk";
		String str1 = "";
		System.out.println(str);
		int cnt = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				str1 += str.charAt(i) +"" + cnt;
				cnt = 1;
			}

		}
		str1 += str.charAt(str.length() - 1) + "" + cnt;
		System.out.println(str1);
	}

}

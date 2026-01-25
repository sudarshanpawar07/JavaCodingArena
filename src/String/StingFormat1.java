package String;

public class StingFormat1 {
	public static void main(String[] args) {
		String str = "a3b3c3d1e1f1g1h1i1k5";
		System.out.println(str);
		String str1 = "";
		char ch1;
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 97 && ch <= 122) {
				if (cnt != 0) {
					str1 += merge(str1.charAt(str1.length() - 1), cnt);
				}
				str1 += ch;
				cnt = 0;
			} else {
				cnt = cnt * 10 + (ch - 48);
			}
		}
		str1 += merge(str1.charAt(str1.length()-1), cnt);
		System.out.println(str1);
	}

	public static String merge(char ch, int cnt) {

		String str = "";

		for (int i = 1; i < cnt; i++)
			str += ch;

		return str;
	}

}

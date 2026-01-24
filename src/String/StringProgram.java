package String;

public class StringProgram {
	public static void main(String[] args) {
		String str = "abcedefabcghiacbj";
		String longest = longestNonRepeatingSubString(str);
		System.out.println("String : " + str);
		System.out.println("longest String is : " + longest);
	}

	public static String longestNonRepeatingSubString(String str) {
		String longest = "";
		for (int i = 0; i < str.length(); i++) {
			String str1 = str.charAt(i) + "";
			for (int j = i + 1; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (!(str1.contains(ch + ""))) {
					str1 += ch;
				} else {
					if (longest.length() < str1.length()) {
						longest = str1;
					}
					str1 = "";
				}

			}
			if ((str.length() - i) < longest.length())
				break;

		}

		return longest;
	}

}

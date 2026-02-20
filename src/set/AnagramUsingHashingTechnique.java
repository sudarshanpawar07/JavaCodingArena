package set;

public class AnagramUsingHashingTechnique {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		System.out.println(isAnagram(s1, s2));
	}

	public static boolean isAnagram(String s1, String s2) {
		s1.toLowerCase();
		s2.toLowerCase();
		if (s1.length() == s2.length()) {
			int[] ct = new int[128];
			for (int i = 0; i < s1.length(); i++) {
				ct[s1.charAt(i)]++;
				ct[s2.charAt(i)]--;
			}

			for (int i = 0; i < ct.length; i++) {
				if (ct[i] != 0) {
					return false;
				}
			}

			return true;
		} else {
			return false;
		}
	}
}

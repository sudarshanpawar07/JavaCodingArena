package set;

public class PanagramUsingHashingTchnique {
	public static void main(String[] args) {
		String s1 = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s1));
	}

	public static boolean isPanagram(String s1) {
		s1.toLowerCase();
		int[] ct = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ct[s1.charAt(i) - 97]++;
			}
		}

		for (int i = 0; i < ct.length; i++) {
			if (ct[i] == 0) {
				return false;
			}
		}
		return true;
	}

}

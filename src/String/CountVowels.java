package String;

public class CountVowels {
	public static void main(String[] args) {
		String str = "sudarshan";
		str = str.toUpperCase();
		System.out.println(str);
		int vowelCount = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'A'||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
			{
				vowelCount++;
			}
		}
		
		System.out.println("Vowel count in a string is : " + vowelCount);
		System.out.println("consonat count in a string is : "+ (str.length()- vowelCount));
	}

}

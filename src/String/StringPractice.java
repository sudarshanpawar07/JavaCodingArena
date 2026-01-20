package String;

public class StringPractice {
	public static void main(String[] args) {
		String str = "HI AM SUDARSHAN.";

		String[] arr = str.split(" ");

		for (String word : arr) {
			word = word + " !";
		}

		System.out.print(" String data : ");
		String data = "";
		for (String word : arr) {
			data = data + word + " ";
		}

		System.out.println(data);
	}

}

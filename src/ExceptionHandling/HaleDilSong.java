package ExceptionHandling;

public class HaleDilSong {

	public static void main(String[] args) throws Exception {

		String[] lyrics = { "ai kaash, kaash yoon hota", "har shaam saath tu hota", "chup chaap dil naa yoon rota",
				"har shaam saath tu hota", "guzaaraa ho tere bin guzaaraa", "ab mushkil hai lagtaa",
				"nazaaraa ho tera hi nazaaraa", "ab har din hai lagtaa", "haal-e-dil tujko sunaata",
				"dil agar ye bol paataa", "ba-khuda, tujko hai chaahata, jaan", "tere sang jo pal bitaata",
				"vaqt se main vo maang laata", "yaad karke muskuraataa haan..." };

		for (String line : lyrics) {
			for (String word : line.split(" ")) {
				System.out.print(word + " ");
				Thread.sleep(700); // delay per word
			}
			System.out.println();
			Thread.sleep(1000); // delay per line
		}
	}
}

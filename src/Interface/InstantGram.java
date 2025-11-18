package Interface;

public interface InstantGram {
	int ATTEMPTS = 3;

	void login(String userName, String pass);

	void post(String msg);

	void logout();

	void like();

	void comment(String name, String comm);

	void story(String text);

	void chat(String name, String msg);

	public static void message(String name) {
		System.out.println("Hey " + name + " welcome to the application.");
	}

}

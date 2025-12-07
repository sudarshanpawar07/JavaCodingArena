package ExceptionHandling;

public class Application {

	static String username = "ramesh";
	static String password = "123";

	public void launchApp() {
		String username = "ramesh";
		String password = null;
		Login login = new Login();

		try {
			login.login(username, password);
		} catch (UserNameNullException une) {
			System.out.println(une.getMessage());

		} catch (UserPasswordNullException pne) {
			System.out.println(pne.getMessage());
		}

	}

}

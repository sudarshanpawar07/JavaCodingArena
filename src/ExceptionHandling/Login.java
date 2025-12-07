package ExceptionHandling;

public class Login {
	public void login(String username, String password) throws UserNameNullException, UserPasswordNullException {

		if (username == null) {
			throw new UserNameNullException("username is null.");
		} else if (password == null) {
			throw new UserPasswordNullException("password is null.");
		}
		if (username.equals(Application.username) && password.equals(Application.password)) {
			System.out.println("login sucessful !");
		}
	}

}

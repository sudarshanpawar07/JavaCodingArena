package Interface;

public abstract class InstantGramImp1 implements InstantGram {

	String email;
	String pass;
	String userName;
	boolean login;
	int attemptCount;

	public InstantGramImp1(String email, String pass, String userName) {
		super();
		this.email = email;
		this.pass = pass;
		this.userName = userName;
		System.out.println("Account Created !");
	}

	@Override
	public void login(String userName, String pass) {
		if (attemptCount <= ATTEMPTS) {
			if (this.userName == userName && this.pass == pass) {
				login = true;
				System.out.println("Login sucess!");
			} else {
				attemptCount++;
				System.out.println("Invalid credentials!");
			}
		} else {
			System.out.println("Account blocked !");
		}

	}

	@Override
	public void logout() {
		login = false;
		System.out.println(" Logged Out Sucessfully!");

	}

	@Override
	public void post(String msg) {
		if (login) {
			System.out.println(msg);
			System.out.println("Posted!");
		} else {
			System.out.println("Please Login!");
		}
	}

	public void comment(String name, String comm) {
		if (login) {
			System.out.println(comm);
			System.out.println(name + " commented!");

		} else {
			System.out.println("Please login!");
		}
	}

	@Override
	public void like() {
		System.out.println("Liked!");

	}
}

package Interface;

public class InstantGramImp2 extends InstantGramImp1 {

	public InstantGramImp2(String email, String pass, String userName) {
		super(email, pass, userName);
	}

	@Override
	public void chat(String name, String msg) {
		System.out.println(msg);
		System.out.println("message sent to " + name);

	}

	@Override
	public void story(String text) {
		System.out.println(text);
		System.out.println(userName + " uploaded story");
	}

	public String toString() {
		return userName;
	}

	@Override
	public boolean equals(Object o) {
		if (o != null) {
			if (o instanceof InstantGramImp2) {
				InstantGramImp2 i = (InstantGramImp2) o;
				return this.userName == i.userName && this.email == i.email && this.pass == i.pass;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return userName.hashCode() + pass.hashCode() + email.hashCode();
	}
}

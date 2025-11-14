package Interface;

public class MotherFatherDriver {

	public static void main(String[] args) {
		Father f = new Nana();
		f.getDegree();
		f.getPackage();
		Father.message();
		System.out.println(Father.PER);

		Mother m = new Nana();
		m.getDegree();
		// m.getPackage();
		Mother.message();
		System.out.println(Mother.PER);

	}

}

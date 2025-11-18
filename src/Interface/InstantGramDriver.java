package Interface;

public class InstantGramDriver {

	public static void main(String[] args) {
		InstantGram i = new InstantGramImp2("raju@gmail.com","Raju@123","Raju_official");
		i.login("Raju_official", "Raju@123");
		i.post("I am very happy!");
		i.comment("Angel Priya", "How?");
		i.comment("Raju", "For you!!");
		i.chat("Angel Priya", "Hi! Are you busy!");
		i.chat("Angle Priya", "Jevlis ka");
		i.chat("Angel Priya", "Are you alive?");
		
		i.story("I am lone wolf!");
		i.comment("sakshi", "Why?");
		InstantGram.message("Raju");
		System.out.println(i);
		InstantGram i1 = new InstantGramImp2("raju@gmail.com","Raju@123","Raju_official");
		System.out.println(i==i1);
		System.out.println(i1.equals(i1));
		System.out.println(i.hashCode());
		System.out.println(i1.hashCode());
	}

}

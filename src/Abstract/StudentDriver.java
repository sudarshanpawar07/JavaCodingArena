package Abstract;

public class StudentDriver {

	public static void main(String[] args) {
		
	Student s1 = new Student(18,"Sudarshan","SPPU");
	Student s2 = new Student (18,"Sudarshan","SPPU");
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.toString());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.name.hashCode());
		System.out.println(s2.name.hashCode());
		System.out.println(s1.id.hashCode());

	}

}

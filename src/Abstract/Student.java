package Abstract;

public class Student {
	boolean b ;
	Integer id;
	String name;
	String coll;
	
	public Student(){
		// super();
	}
	
	public Student(int id,String name,String coll)
	{
		super();
		this.id = id;
		this.coll = coll;
		this.name = name;
	}
	
	public boolean equals(Object o)
	{
		Student s = (Student)o;
		System.out.println(s.toString());
		
		
		if(this.id == s.id && this.name ==s.name && this.coll == s.coll) {
			return true;
		}
		
		return false;
	}
	
	public int hashCode()
	{
		return name.hashCode()+coll.hashCode()+id;
	}
	
	
}

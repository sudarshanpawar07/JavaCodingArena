package ExceptionHandling;

class Employee extends Address implements Cloneable {

	String ename;
	String eid;
	double salary;
	long contact;

	Employee(String ename, String eid, double salary, long contact, String area, String city, int pin) {
		super(area, city, pin);
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.contact = contact;
	}

	public void displayEmployee() {
		System.out.println("Name  : " + ename);
		System.out.println("Id  : " + eid);
		System.out.println("Salary : " + salary);
		System.out.println("Contact :  " + contact);

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

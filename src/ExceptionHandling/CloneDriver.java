package ExceptionHandling;

public class CloneDriver {

	public static void main(String[] args) {

		Employee oldObj = new Employee("Nana", "Emp123", 20000, 1234567890l, "Deccan", "Pune", 411046);

		oldObj.displayEmployee();
		oldObj.displayAddress();
		Employee newObj = null;
		try {
			newObj = (Employee) oldObj.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Exception handled..");
		}

		System.out.println("-----------------------------------------");

		newObj.displayEmployee();
		newObj.displayAddress();

	}

}

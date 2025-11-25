package ExceptionHandling;
class Address {
	String area;
	String city;
	int pin;

	public Address(String area, String city, int pin) {
		this.area = area;
		this.city = city;
		this.pin = pin;

	}

	public void displayAddress() {
		System.out.println("Area : " + area + "\ncity : " + city + "\nPin : " + pin);
	}
}

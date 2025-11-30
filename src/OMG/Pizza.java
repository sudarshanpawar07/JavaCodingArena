package OMG;

public class Pizza implements Order {
	double price = 150;
	double seasoningCharge = 0;
	double cheeseCharge = 0;

	public Pizza(String name) {
		System.out.println(name);
	}

	public void prepareFood() {
		System.out.println("Preparing Pizza..");
	}

	public void seasoning() {
		seasoningCharge = 10;
	}

	public void extraCheese() {
		cheeseCharge = 30;
	}

	public double getBill() {
		return price + seasoningCharge + cheeseCharge;
	}
}

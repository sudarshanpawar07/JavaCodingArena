package OMG;

public class Pizza implements Order {
	double price = 150;
	double seasoningCharge = 0;
	double cheeseCharge = 0;

	public void prepareFood() {
		System.out.println("Preparing Burger..");
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

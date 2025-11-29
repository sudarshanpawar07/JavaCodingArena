package OMG;

public class Burger implements Order {
	double price = 100;
	double seasoningCharge = 0;
	double cheeseCharge = 0;

	public void prepareFood() {
		System.out.println("Preparing Burger..");
	}

	public void seasoning() {
		seasoningCharge = 10;
	}

	public void extraCheese() {
		cheeseCharge = 20;
	}

	public double getBill() {
		return price + seasoningCharge + cheeseCharge;
	}

}

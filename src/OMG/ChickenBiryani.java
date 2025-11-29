package OMG;

public class ChickenBiryani implements Order {
	double price = 180;
	double seasoningCharge = 0;
	double cheeseCharge = 0;

	public void prepareFood() {
		System.out.println("Preparing Burger..");
	}

	public void seasoning() {
		seasoningCharge = 15;
	}

	public void extraCheese() {
		cheeseCharge = 40;
	}

	public double getBill() {
		return price + seasoningCharge + cheeseCharge;
	}

}

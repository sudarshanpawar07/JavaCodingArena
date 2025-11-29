package OMG;

public class ChickenBiryani implements Order {
	private double price = 180;
	private double seasoningCharge = 0;
	private double cheeseCharge = 0;

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

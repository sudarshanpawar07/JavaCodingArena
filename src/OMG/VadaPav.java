package OMG;

public class VadaPav implements Order {
	private double price = 20;
	private double seasoningCharge = 0;
	private double cheeseCharge = 0;

	public void prepareFood() {
		System.out.println("Preparing Burger..");
	}

	public void seasoning() {
		seasoningCharge = 5;
	}

	public void extraCheese() {
		cheeseCharge = 10;
	}

	public double getBill() {
		return price + seasoningCharge + cheeseCharge;
	}

}

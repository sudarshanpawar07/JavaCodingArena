package OMG;

import java.util.*;

public class OmgDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		double grandTotal = 0; // total of all orders

		while (running) {
			System.out.println("----- MENU -----");
			System.out.println("1. Pizza");
			System.out.println("2. Burger");
			System.out.println("3. Vadapav");
			System.out.println("4. Chicken Biryani");
			System.out.println("5. Show Receipt");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			Order order = null;

			switch (choice) {
			case 1:
				order = new Pizza();
				break;
			case 2:
				order = new Burger();
				break;
			case 3:
				order = new VadaPav();
				break;
			case 4:
				order = new ChickenBiryani();
				break;
			case 5:
				// RECEIPT (only grand total)
				System.out.println("----- RECEIPT -----");
				System.out.println("Total Amount: " + grandTotal);
				System.out.println("-------------------");
				continue; // back to menu
			case 6:
				// EXIT
				running = false;
				System.out.println("Thank you. Visit again!");
				continue;
			default:
				System.out.println("Invalid choice!");
				continue;
			}

			// if food selected (1–4)
			if (order != null) {
				order.prepareFood();

				System.out.print("Add seasoning? (y/n): ");
				String s = sc.next();
				if (s.equalsIgnoreCase("y")) {
					order.seasoning();
				}

				System.out.print("Add extra cheese? (y/n): ");
				String c = sc.next();
				if (c.equalsIgnoreCase("y")) {
					order.extraCheese();
				}

				double amount = order.getBill();
				System.out.println("Amount for this order: " + amount);
				grandTotal += amount; // add to receipt total
				System.out.println("------------------------------");
			}
		}

		sc.close();

	}

}

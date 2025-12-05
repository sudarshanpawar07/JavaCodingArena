package ExceptionHandling;

import java.util.*;

class InsufficientFundsException extends RuntimeException {
	InsufficientFundsException(String desc) {
		super(desc);
	}
}

class InvalidPinException extends RuntimeException {
	InvalidPinException(String desc) {
		super(desc);
	}
}

class Bank {
	private String name;
	private String pin;
	private double balance;

	Bank(String name, String pin, double balance) {
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}

	public void deposit(double amt) {
		this.balance += amt;
		System.out.println("Amount Deposited");
	}

	public void withdraw(double amt) {
		if (this.balance < amt) {
			throw new InsufficientFundsException("Insufficient balance.");
		}
		this.balance -= amt;
		System.out.println("Amt withdraw sucessfully.");
	}

	public double getBalance(String pin) {
		if (this.pin.equals(pin)) {
			return this.balance;
		}
		throw new InvalidPinException(" entered pin is invalid.");
	}
}

class BankDriver{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Bank bank = new Bank("ramesh", "123", 2000);

		for (;;) {
			System.out.println("\n WELCOME TO HDFC BANK \n");
			System.out.println("1. DEPOSIT ");
			System.out.println("2. WITHDRAW ");
			System.out.println("3.  CHECK BALANCE ");
			System.out.println("4.  EXIT  ");

			System.out.println(" ** Enter your Option :  ");

			switch (sc.nextInt()) {
			case 1 -> {
				System.out.print("\n Enter Amount : ");
				bank.deposit(sc.nextInt());
				break;
			}

			case 2 -> {
				System.out.print("\n Enter Amount  to withdraw : ");
				bank.withdraw(sc.nextInt());
				break;
			}

			case 3 -> {
				System.out.print("\n Enter Pin : ");
				double bal = bank.getBalance(sc.next());
				System.out.println("balance is : " + bal);
				break;
			}
			case 4 -> {
				System.out.print(" THANK U VISIT AGAIN ;) ");
				System.exit(0);
				break;
			}
			default -> {
				System.out.println("INVLID OPTION ..");
			}

			}
		}

	}

}
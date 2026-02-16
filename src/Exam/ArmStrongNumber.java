package Exam;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number :");
		int num = sc.nextInt();

		int temp = num, count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;

		}
		int temp1 = num, sum = 0;
		while (temp1 != 0) {
			int digit = temp1 % 10;
			sum += Math.pow(digit, count);
			temp1 /= 10;

		}
		if (num == sum) {
			System.out.println(num + " is ArmStrong Number.");

		} else {
			System.out.println(num + " is Not ArmStrong Number.");
		}

		sc.close();
	}

}

/*
 
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153; // Input number
        int originalNum = num; // Store original number for comparison
        int sum = 0; // Initialize sum of digits raised to power
        int digits = String.valueOf(num).length(); // Find the number of digits

        // While loop to calculate the sum of digits raised to the power of digits
        while (num != 0) {
            int remainder = num % 10; // Extract last digit
            sum += Math.pow(remainder, digits); // Add raised power of digit to sum
            num /= 10; // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}

*/

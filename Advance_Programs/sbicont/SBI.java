package sbiUsingIf;

import java.util.Scanner;

public class SBI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		System.out.println("Enter Account Holder Name : ");
		String name = sc.nextLine();
		a1.setAccountHolderName(name);
		System.out.println("Enter Account Holder Number : ");
		String number = sc.next();
		a1.setAccountHolderNumber(number);
		a1.getDetails();
		int rep = 0;
		do {
			System.out.println("Enter the option ==> Enter 1 for deposit // Enter 2 for withdraw // Enter any other key to exit");
			int value = sc.nextInt();
			if (value == 1) {
				System.out.println("Enter the amount to deposit");
				int amount = sc.nextInt();
				a1.deposit(amount);
				a1.getDetails();
				rep = 1;
			}
			else if (value == 2) {
				System.out.println("Enter the amount to withdraw : ");
				double amount  = sc.nextDouble();
				a1.withdraw(amount);
				a1.getDetails();
				rep = 1;
			}
			else if (value == 3) {
				break;
			}
		} while (rep == 1);
		a1.getDetails();
	}
}

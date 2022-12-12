package poo.contaBancaria;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Account account;
		System.out.print("Enter account number: ");
		Integer accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Will there be an initial deposit ? (y/n): ");
		char c = sc.next().charAt(0);
		if(c == 'y') {
			System.out.print("Enter initial deposit value: ");
			Double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, holder, initialDeposit);
		}else {
			account = new Account(accountNumber, holder);
		}
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withraw(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		sc.close();
	}
	
}

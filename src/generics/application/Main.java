package generics.application;

import java.util.Collections;
import java.util.Scanner;

import generics.service.PrintService;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores quer digitar ?");
		int n = sc.nextInt();
		PrintService<String> printService = new PrintService<>();
		for (int i = 0; i < n; i++) {
			printService.addValue(sc.next());
		}
		printService.print();
		System.out.println("First: " + printService.first());
		sc.close();

	}
}

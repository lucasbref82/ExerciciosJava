package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter with n numbers: ");
		int n = sc.nextInt();
		double[] alturas = new double[n];
		double soma = 0;
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Height: "+ (i + 1));
			soma = soma + sc.nextDouble();
		}
		System.out.println("Average height: " + String.format("%.2f", soma / alturas.length));
		sc.close();
		
	}
	
	
}

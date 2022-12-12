package vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar ?");
		int n = scanner.nextInt();
		double[] vetor = new double[n];
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = scanner.nextDouble();
		}
		double soma = 0;
		System.out.print("VALORES = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			soma += vetor[i];
		}
		System.out.println();
		System.out.print("SOMA = " + String.format("%.2f", soma));
		double media = soma / vetor.length;
		System.out.println();
		System.out.print("MÉDIA = " + String.format("%.2f", media));
		
		scanner.close();
	}
}

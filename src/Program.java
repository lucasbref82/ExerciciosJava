import java.util.Locale;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");

		int n = sc.nextInt();

		String[] nome = new String[n];

		int[] idade = new int[n];

		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa:");

			System.out.print("Nome: ");

			nome[i] = sc.next();

			System.out.print("Idade: ");

			idade[i] = sc.nextInt();

			System.out.print("Altura: ");

			altura[i] = sc.nextDouble();

		}

		double sum = 0;

		for (int i = 0; i < n; i++) {

			sum += altura[i];

		}

		System.out.printf("Altura media: %.2f%n", sum / altura.length);

		System.out.println();

// FUNÇÃO PARA RETORNAR A PORCENTAGEM

		int cont = 0;

		for (int i = 0; i < idade.length; i++) {

			if (idade[i] < 16) {

				cont += 1;

			}

		}

// SYSOUT PARA REORNAR A PORCENTAGEM

		double porcentage = (cont * 100.0) / idade.length;

// SYSOUT PARA IMPRIMIR A PORCENTAGEM

		System.out.println("Pessoas com menos de 16 anos: "

				+ String.format("%.1f%%%n", porcentage));

// FUNÇÃO PARA RETORNAR O NOME

		for (int i = 0; i < n; i++) {

			if (idade[i] < 16) {

				System.out.println(nome[i]);

			}

		}

		sc.close();

	}

}
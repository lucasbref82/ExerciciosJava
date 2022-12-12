package vetores.dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa");
			System.out.println();
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa");
			System.out.println();
			char genero = sc.next().charAt(0);
			pessoa[i] = new Pessoa(altura, genero);
		}
		System.out.printf("Menor altura: %.2f%n", calculaMenor(pessoa));
		System.out.printf("Maior altura: %.2f%n", calculaMaior(pessoa));
		double soma = 0;
		int numeroHomens = 0;
		int quantidadeMulheres = 0;
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getGenero() == 'M') {
				numeroHomens += 1;
			}else {
				quantidadeMulheres ++;
				soma += pessoa[i].getAltura();
			}
		}
		System.out.printf("Média das alturas das mulheres: %.2f%n", soma / quantidadeMulheres);
		System.out.print("Número de homens: "+ numeroHomens);
		sc.close();
	}
	
	
	public static double calculaMenor(Pessoa pessoa[]) {
		double menor = pessoa[0].getAltura();
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getAltura() < menor) {
				menor = pessoa[i].getAltura();
			}
		}
		return menor;
	}
	
	public static double calculaMaior(Pessoa pessoa[]) {
		double maior = pessoa[0].getAltura();
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getAltura() > maior) {
				maior = pessoa[i].getAltura();
			}
		}
		return maior;
	}

}

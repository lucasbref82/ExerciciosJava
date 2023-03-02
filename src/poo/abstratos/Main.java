package poo.abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> formas = new ArrayList<>();
		System.out.print("Digite o n�mero de formas: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Forma #" + i);
			System.out.print("Retangulo ou circulo (r/c)? ");
			char forma = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			String cor = sc.next().toUpperCase();
			if(forma == 'r') {
				System.out.print("Largura: ");
				Double largura = sc.nextDouble();
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				formas.add(new Retangulo(Cor.valueOf(cor), altura, largura));
			}else {
				System.out.print("Raio: ");
				Double Raio = sc.nextDouble();
				formas.add(new Circulo(Cor.valueOf(cor), Raio));
			}
		}
		System.out.println("�REAS DAS FORMAS : ");
		for (Forma forma : formas) {
			System.out.println(String.format("%.2f", forma.area()));
			
		}

		sc.close();
	}

}

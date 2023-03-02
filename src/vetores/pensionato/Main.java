package vetores.pensionato;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos quartos voc� vai alugar ?");
		Aluguel[] vetor = new Aluguel[9];
		Integer quartos = sc.nextInt();
		for(int i = 1; i <= quartos; i++) {
			System.out.println("Aluguel "+i+"#");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			Integer quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome, email, quarto);
		}
		System.out.println("Quartos alugados: ");
		StringBuilder builder; 
		for (Aluguel aluguel : vetor) {
			if(aluguel == null) {
				continue;
			}
			builder = new StringBuilder();
			builder.append(aluguel.getQuarto()).append(": ").append(aluguel.getNome()).append(", ").append(aluguel.getEmail() + "\n");
			System.out.print(builder.toString());
		}
		sc.close();
	}
}

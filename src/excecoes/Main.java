package excecoes;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			System.out.print("Número do quarto: ");
			Integer numeroQuarto = sc.nextInt();
			System.out.print("Data de entrada: ");
			LocalDate entrada = LocalDate.parse(sc.next(), formatter);
			System.out.print("Data de saída: ");
			LocalDate saida = LocalDate.parse(sc.next(), formatter);
			Reserva reserva = new Reserva(numeroQuarto);
			reserva.atualizarDatas(entrada, saida);
			System.out.println(reserva);
			System.out.println();
			System.out.println("Entre com os dados atualizados da reserva: ");
			System.out.print("Data de entrada: ");
			entrada = LocalDate.parse(sc.next(), formatter);
			System.out.print("Data de saída: ");
			saida = LocalDate.parse(sc.next(), formatter);
			reserva.atualizarDatas(entrada, saida);
			System.out.println(reserva);
		} catch (DataInvalidaException e) {
			e.printStackTrace();
		} catch (DateTimeParseException e) {
			System.out.println("Formato de data inválida.");
			e.printStackTrace();
		}
		sc.close();

	}
}

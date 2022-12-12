package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora {
	public static void main(String[] args) {
		// toString() automaticamente já converte para o padrão ISO8601

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// Data atual
		LocalDate d01 = LocalDate.now();
		System.out.println(d01.toString());

		// Data hora atual
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02.toString());

		// Data hira atual padrão GMT
		Instant d03 = Instant.now();
		System.out.println(d03.toString());

		// Formatando data no com mascara desejada
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d04.toString());

		// Formatando data e hora no com mascara desejada
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T14:25:30");
		System.out.println(d05.toString());

		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println(d06.toString());

		// Adicionando 3 horas a mais no formato GMT
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println(d07.toString());

		// Instanciando formatos customizados
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println(d08.toString());

		// Instanciando formatos customizados
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println(d09.toString());

		// Instanciando com valores isoladamente
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		System.out.println(d10.toString());
	}
}

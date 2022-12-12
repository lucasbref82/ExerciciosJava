package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalculosComDataHora {
	public static void main(String[] args) {
		LocalDate d04 = LocalDate.now();
		LocalDateTime d05 = LocalDateTime.now();
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// Subtraindo 7 dias da data
		LocalDate semanaPassada = d04.minusDays(7);
		
		// Adicionando 7 dias à data
		LocalDate proximaSemana = d04.plusDays(7);
		
		System.out.println("Semana Passada: " + semanaPassada);
		System.out.println("Proxima Semana: " + proximaSemana);
		
		LocalDateTime horaPassada = d05.minusHours(1);
		LocalDateTime proximaHora = d05.plusHours(1);
		
		System.out.println("Hora Anterior: " + horaPassada);
		System.out.println("Proxima Hora: " + proximaHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		// Calculando duração entre datas
		Duration duration = Duration.between(d04.atTime(0, 0), semanaPassada.atTime(0, 0));
		
		System.out.println(duration.toDays());
	}
}

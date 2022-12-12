package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterDataHoraGlobalParaLocal {
	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.now();
		Instant d06 = Instant.now();
		
		/*
		 * for(String s : ZoneId.getAvailableZoneIds()) { System.out.println(s); }
		 */
		
		// Pegando o momento atual em londres e convertendo para o horário local
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		// Pegando o momento atual em londres e convertendo para o horário portugal
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("R1 = " + r1);
		System.out.println("R2 = " + r2);
		
		System.out.println("R3 = " + r3);
		System.out.println("R4 = " + r4);
		
		
		// Recuperando valores da data separadamente o mesmo vale para LocalDateTime
		System.out.println("D4 dia = " + d04.getDayOfMonth());
		System.out.println("D4 mês = " + d04.getMonthValue());
		System.out.println("D4 Ano = " + d04.getYear());
		
		System.out.println("D5 Hora = " + d05.getHour());
		System.out.println("D5 Minuto = " + d05.getMinute());
	}
}

package excecoes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private Integer numeroQuarto;
	private LocalDate entrada;
	private LocalDate saida;

	public Reserva() {

	}

	public Reserva(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public LocalDate getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDate entrada) {
		this.entrada = entrada;
	}

	public LocalDate getSaida() {
		return saida;
	}

	public void setSaida(LocalDate saida) {
		this.saida = saida;
	}

	public void atualizarDatas(LocalDate entrada, LocalDate saida) throws DataInvalidaException {
		if(entrada.isAfter(saida)) {
			throw new DataInvalidaException("Data de entrada deve ser anterior à data de saida.");
		}
		if(entrada.isBefore(LocalDate.now()) || saida.isBefore(LocalDate.now())) {
			throw new DataInvalidaException("Reservas só podem ocorrer para datas futuras.");
		}
		this.entrada = entrada;
		this.saida = saida;
	}

	private Long duracao() {
		return ChronoUnit.DAYS.between(entrada, saida);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reserva: ")
		.append("Quarto "+ numeroQuarto + ", ")
		.append("entrada: " + entrada.format(formatter) + ", ")
		.append("saída: " + saida.format(formatter) + ", ")
		.append(duracao() + " noites");
		return builder.toString();
	}
}

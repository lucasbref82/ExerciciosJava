package poo.execicios_polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{
	private LocalDate dataFabricacao;
	
	public ProdutoUsado(){
		super();
	}

	public ProdutoUsado(String nome, Double preco, TipoProdutoEnum tipoProduto, LocalDate dataFabricacao) {
		super(nome, preco, tipoProduto);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return String.format(nome + " (usado) $ %.2f (Data de fabricação: " 
				+ dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")", preco);
	}
	
	
}

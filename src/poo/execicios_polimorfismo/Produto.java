package poo.execicios_polimorfismo;

public class Produto {
	
	protected String nome;
	protected Double preco;
	protected TipoProdutoEnum tipoProduto;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Double preco, TipoProdutoEnum tipoProduto) {
		this.nome = nome;
		this.preco = preco;
		this.tipoProduto = tipoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String etiquetaPreco() {
		return String.format(nome + " $ %.2f", preco);
	}
}

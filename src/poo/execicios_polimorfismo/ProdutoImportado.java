package poo.execicios_polimorfismo;

public class ProdutoImportado extends Produto {
	private Double taxaAlfandegaria;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, TipoProdutoEnum tipoProduto, Double taxaAlfandegaria) {
		super(nome, preco, tipoProduto);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	public Double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	
	private Double precoTotal() {
		return preco + taxaAlfandegaria;
	}
	
	@Override
	public String etiquetaPreco() {
		return String.format(nome + " $ %.2f (Taxa alfandegária: $ %.2f)", precoTotal(), taxaAlfandegaria);
	}
	

}

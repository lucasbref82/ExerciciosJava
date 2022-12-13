package poo.pedido;

public class ItemPedido {
	private Produto produto;
	private Integer quantidade;
	private Double preco;
	
	
	
	public ItemPedido() {
		
	}
	
	public ItemPedido(Produto produto, Integer quantidade, Double preco) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double subTotal() {
		return preco * quantidade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(produto.getNome())
		.append(", ")
		.append("$"+String.format("%.2f", preco))
		.append(", ")
		.append("Quantidade: ")
		.append(quantidade)
		.append(", ")
		.append("Subtotal: ")
		.append(String.format("%.2f", subTotal()));
		return builder.toString();
	}
	
	
}

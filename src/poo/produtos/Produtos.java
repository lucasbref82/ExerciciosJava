package poo.produtos;

public class Produtos {
	public String name;
	public Double price;
	public Integer quantity;
	

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(Integer quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(Integer quantity) {
		this.quantity -= quantity;
	}
	
	
	@Override
	public String toString() {
		return "Dados do produto: \nNome: "
				+this.name+", Preço: "
				+String.format("%.2f", this.price)
				+", Quantity: "+this.quantity;
	}
	
}

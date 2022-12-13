package poo.pedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private LocalDateTime momento;
	private StatusPedido statusPedido;
	private List<ItemPedido> itemsPedido;
	private Cliente cliente;

	public Pedido() {
		this.itemsPedido = new ArrayList<>();
	}

	public Pedido(LocalDateTime momento, StatusPedido statusPedido, Cliente cliente) {
		
		this.momento = momento;
		this.statusPedido = statusPedido;
		this.itemsPedido = new ArrayList<>();
		this.cliente = cliente;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setOrderStatus(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	public void adicionaItem(ItemPedido itemPedido) {
		this.itemsPedido.add(itemPedido);
	}
	
	public void removeItem(ItemPedido itemPedido) {
		this.itemsPedido.remove(itemPedido);
	}
	
	public Double total() {
		Double total = Double.valueOf(0);
		for (ItemPedido itemPedido : itemsPedido) {
			total += itemPedido.subTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Momento do pedido: " + momento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n")
		.append("Status Pedido: ").append(statusPedido.toString()).append("\n")
		.append("Cliente: ").append(cliente.getNome()).append(" ").append("(")
		.append(cliente.getAniversario().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))).append(")").append(" - ")
		.append(cliente.getEmail()).append("\n");
		System.out.println("Items do Pedido: ");
		for (ItemPedido itemPedido : itemsPedido) {
			builder.append(itemPedido + "\n");
		}
		builder.append("Preço Total: ")
		.append("$" + String.format("%.2f", total()));
		return  builder.toString();
		
		
	}
	
	

}

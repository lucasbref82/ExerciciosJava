package poo.pedido;

import java.time.LocalDateTime;

import poo.enums.StatusPedidoEnum;

public class Pedido {
	private Integer id;
	private LocalDateTime momento;
	private StatusPedidoEnum statusPedidoEnum;
	
	public Pedido() {
		
	}
	
	public Pedido(Integer id, LocalDateTime moment, StatusPedidoEnum statusPedidoEnum) {
		this.id = id;
		this.momento = moment;
		this.statusPedidoEnum = statusPedidoEnum;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getMoment() {
		return momento;
	}
	public void setMoment(LocalDateTime moment) {
		this.momento = moment;
	}
	public StatusPedidoEnum getStatusPedidoEnum() {
		return statusPedidoEnum;
	}
	public void setStatusPedidoEnum(StatusPedidoEnum statusPedidoEnum) {
		this.statusPedidoEnum = statusPedidoEnum;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", statusPedidoEnum=" + statusPedidoEnum + "]";
	}
	
	
	
	
	
}

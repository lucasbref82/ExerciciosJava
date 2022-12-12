package poo.pedido;

import java.time.LocalDateTime;

import poo.enums.StatusPedidoEnum;

public class Main {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(1, LocalDateTime.now() , StatusPedidoEnum.AGUARDANDO_PAGAMENTO);
		System.out.println(pedido);
		
		
	}
}

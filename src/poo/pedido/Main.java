package poo.pedido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data aniversário: ");
		LocalDate dataAniversario = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusPedido statusPedido = StatusPedido.valueOf(sc.next());
		Pedido pedido = new Pedido(LocalDateTime.now(), statusPedido, new Cliente(nome, email, dataAniversario));
		System.out.print("Quantos items terá no pedido ?");
		int quantidadeItems = sc.nextInt();
		for (int i = 1; i <= quantidadeItems; i++) {
			System.out.println("Entre com os dados do item #"+i);
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.next();
			System.out.print("Preço do produto: ");
			Double precoProduto = sc.nextDouble();
			System.out.print("Quantidade do produto: ");
			Integer quantidade = sc.nextInt();
			pedido.adicionaItem(new ItemPedido(new Produto(nomeProduto, precoProduto), quantidade, precoProduto));
		}
		System.out.println("Resumo do pedido: ".toUpperCase());
		System.out.println(pedido.toString());
		
		
		
	}

}

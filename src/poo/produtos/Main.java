package poo.produtos;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Produtos p = new Produtos();
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		p.name = sc.nextLine();
		System.out.print("Preço: ");
		p.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		p.quantity = sc.nextInt();
		System.out.println(p.toString());
		System.out.print("Adicione uma quantidade de produtos: ");
		p.addProducts(sc.nextInt());
		System.out.println(p.toString());
		System.out.print("Remova uma quantidade de produtos: ");
		p.removeProducts(sc.nextInt());
		System.out.println(p.toString());
		System.out.println("Valor total em estoque: R$" + String.format("%.2f", p.totalValueInStock()));
		sc.close();
		
		
		
	}
	
	
}

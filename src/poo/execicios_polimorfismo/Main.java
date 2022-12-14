package poo.execicios_polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		System.out.print("Digite o número de produtos: ");
		int n = scanner.nextInt();
		for(int i = 1; i <= n ; i++) {
			System.out.println("Dados do produto #"+i);
			System.out.print("Comum usado ou importado ? ");
			String tipoProduto = scanner.next();
			System.out.print("Nome: ");
			String nome = scanner.next();
			System.out.print("Preco: ");
			Double preco = scanner.nextDouble();
			if (tipoProduto.toUpperCase().equals(TipoProdutoEnum.IMPORTADO.toString())) {
				System.out.print("Taxa Alfandegária: ");
				Double taxaAlfandegaria = scanner.nextDouble();
				produtos.add(new ProdutoImportado(nome, preco, TipoProdutoEnum.valueOf(tipoProduto.toUpperCase()), taxaAlfandegaria));
			}else if (tipoProduto.toUpperCase().equals(TipoProdutoEnum.USADO.toString())) {
				System.out.print("Data de fabricação: ");
				String data = scanner.next();
				LocalDate localDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				produtos.add(new ProdutoUsado(nome, preco, TipoProdutoEnum.valueOf(tipoProduto.toUpperCase()), localDate));
			}else {
				produtos.add(new Produto(nome, preco, TipoProdutoEnum.valueOf(tipoProduto.toUpperCase())));
			}
		}
		System.out.println();
		System.out.println("Etiquetas de preço: ");
		for (Produto produto : produtos) {
			System.out.println(produto.etiquetaPreco());
		}
		
		scanner.close();
		
	}
}

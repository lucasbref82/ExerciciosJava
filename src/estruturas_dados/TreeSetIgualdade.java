package estruturas_dados;

import java.util.Set;
import java.util.TreeSet;

import estruturas_dados.entidades.Produto;

public class TreeSetIgualdade {
	
	public static void main(String[] args) {
		
		// TreeSet testa a igualdade com a interface Comparable.
		Set<Produto> produtos = new TreeSet<>();
		produtos.add(new Produto("Televisão", 1200.0));
		produtos.add(new Produto("Computador", 100.0));
		produtos.add(new Produto("Notebook", 1100.0));
		
		
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
		
	}
	
}

package listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		// Removento por predicado

		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("------------------");
		
		// Removendo através de um predicato.
		// Predicado é uma função booleana que geralmente retorna verdadeiro ou falso
		list.removeIf(x -> x.startsWith("M"));
		
	
		for (String string : list) {
			System.out.println(string);
		}
		
		// Usando filter, primeiro converte para stream e depois converte para lista.
		List<String> filtrado = list.stream().filter(x -> x.startsWith("A")).toList();
		
		System.out.println("------------------");
		for (String string : filtrado) {
			System.out.println(string);
		}
		
		System.out.println("------------------");
		String name = list.stream().filter(x -> x.startsWith("A")).findFirst().orElseGet(null);
		System.out.println(name);

		
	}
}

package generics.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> lista = new ArrayList<>();

	public void addValue(T valor) {
		lista.add(valor);
	}

	public T first() throws Exception {
		if (lista.isEmpty()) {
			throw new Exception("Lista está vazia.");
		}
		return lista.get(0);
	}

	public void print() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		if(!lista.isEmpty()) {
			builder.append(lista.get(0));
		}
		for(int i = 1; i < lista.size(); i++) {
			builder.append(" ,");
			builder.append(lista.get(i));
			
		}
		builder.append("]");
		System.out.println(builder.toString());
	}
}

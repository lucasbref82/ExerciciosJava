package contravariancia;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("lucas");
		list.add("leticia");
		
		// Permite adicionar Number ou supertipo de Number
		List<? super Number> numbers = list;
		
		numbers.add(3);
		numbers.add(3.15);
		
		// Não pode acessar os objetos da lista.
		// Number valor = numbers.get(0);
	}

}

package covariancia;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<>();
		listInt.add(1);
		listInt.add(2);
		
		List<? extends Number> list = listInt;
		
		System.out.println(list.get(0));
		
		// Adicionar um elemento dá erro de compilação
		//list.add(3);
	}
}

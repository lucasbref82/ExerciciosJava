package generics.service;

import java.util.List;

public class CalculationService {
	
	public <T extends Comparable<T>> T max(List<T> lista) {
		if(lista.isEmpty()) {
			throw new IllegalArgumentException("Lista não poder ser nula !");
		}
		T max = lista.get(0);
		for(T t : lista) {
			if(t.compareTo(max) > 0) {
				max = t;
			}
		}
		return max;
	}
}

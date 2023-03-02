package generics.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCopia {
	
	public static void main(String[] args) {
		List<Number> listNumber = Arrays.asList(1,2,3);
		List<Double> listDouble = Arrays.asList(2.5,3.7,15.0);
		List<Object> listObject = new ArrayList<>();
		
		copy(listNumber, listObject);
		copy(listDouble, listObject);
		
		printList(listNumber);
		printList(listDouble);
		printList(listObject);

	}
	
	
	private static void copy(List<? extends Number> listaExtends, List<? super Number> listaSuper) {
		for (Number number : listaExtends) {
			listaSuper.add(number);
		}
	}
	
	public static void printList(List<?> listaGenereica) {
		for (Object object : listaGenereica) {
			System.out.print(object);
		}
		System.out.println();
	}

	
}

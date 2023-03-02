package estruturas_dados;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class InterfaceSet {

	public static void main(String[] args) {
		// HashSet mais r�pido por�m pega a ordem aleatoriamente.
		// TreeSet mais lendo pois, ordena os dados da estrutura.
		// LinkedHashSet interm�diario, busca de acordo com a ordem de inser��o dos dados.
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		// Uni�o (Elementos n�o se repetem, somente elementos diferentes)
		Set<Integer> c = new TreeSet<>(a);
 		c.addAll(b);
 		System.out.println(c);
 		
 		// Intersec��o (Elementos que o conjunto tem em comum)
		Set<Integer> d = new TreeSet<>(a);
 		c.retainAll(b);
 		System.out.println(d);
 		
 		// Diferen�a (Remove de um elemento tudo que est� em outro)
		Set<Integer> e = new TreeSet<>(a);
 		c.removeAll(b);
 		System.out.println(e);
	}

}

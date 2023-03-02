package estruturas_dados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEstudantes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> cursos = new HashSet<>();
		System.out.print("Quantos estudantes tem no curso A ? ");
		int n = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			cursos.add(sc.nextInt());
		}
		System.out.print("Quantos estudantes tem no curso B ? ");
		n = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			cursos.add(sc.nextInt());
		}
		System.out.print("Quantos estudantes tem no curso C ? ");
		n = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			cursos.add(sc.nextInt());
		}
		System.out.println("Total de estudantes: " + cursos.size());
		sc.close();
	}
}

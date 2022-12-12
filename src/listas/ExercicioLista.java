package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioLista {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos empregados você quer registrar ?");
		int n = sc.nextInt();
		List<Empregado> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			System.out.println("Empregado #"+ i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.next(); 
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			list.add(new Empregado(id, nome, salario));
			System.out.println();
		}
		System.out.print("Entre com o id do empregado que terá o aumento de salário: ");
		Integer id = sc.nextInt();
		Empregado bonificado = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
		if(bonificado == null) {
			System.out.println("Empregado não existe!");
		}else {
			System.out.print("Entre com a porcentagem: ");
			bonificado.aumentoSalario(sc.nextDouble());
		}
		
		System.out.println("Lista de empregados: ");
		for (Empregado empregado : list) {
			System.out.println(empregado);
		}
	}
}

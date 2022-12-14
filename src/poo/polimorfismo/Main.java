package poo.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		System.out.print("Digite o número de funcionários: ");
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do empregado #"+ i +": ");
			System.out.print("Terceirizado (s/n)? ");
			char terceirizado = scanner.next().charAt(0);
			System.out.print("Nome: ");
			String nome = scanner.next();
			System.out.print("Horas Trabalhadas: ");
			Integer horas = scanner.nextInt();
			System.out.print("Valor por Hora: ");
			Double valorPorHora = scanner.nextDouble();
			if(terceirizado == 's') {
				System.out.print("Despesas adicionais: ");
				Double despesasAdicionais = scanner.nextDouble();
				funcionarios.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, despesasAdicionais));
			}else {
				funcionarios.add(new Funcionario(nome, horas, valorPorHora));
			}
		}
		System.out.println("");
		System.out.println("PAGAMENTOS: ");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(String.format(funcionario.getNome() + " - $%.2f", funcionario.pagamento()));
		}
		scanner.close();
	}
}

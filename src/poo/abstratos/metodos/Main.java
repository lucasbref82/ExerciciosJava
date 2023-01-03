package poo.abstratos.metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Pessoa> pessoas =  new ArrayList<>();
		System.out.print("Digite o número de pagadores de  impostos: ");
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do pagador de imposto #"+ i);
			System.out.print("Jurídica ou Física ?");
			char tipoPessoa = scanner.next().charAt(0);
			System.out.print("Nome: ");
			String nome = scanner.next();
			System.out.print("Renda anual: ");
			Double rendaAnual = scanner.nextDouble();
			if(tipoPessoa == 'j') {
				System.out.print("Quantidade de funcionários: ");
				Integer quantidadeFuncionarios = scanner.nextInt();
				Pessoa pessoa = new PessoaJuridica(nome, rendaAnual, quantidadeFuncionarios);
				pessoas.add(pessoa);
			}else {
				System.out.print("Gastos com saúde: ");
				Double gastosSaude = scanner.nextDouble();
				Pessoa pessoa = new PessoaFisica(nome, rendaAnual, gastosSaude);
				pessoas.add(pessoa);
			}
		}
		System.out.println("Impostos pagos: ");
		Double somaImpostos = Double.valueOf(0);
		for (Pessoa pessoa : pessoas) {
			System.out.println(String.format(pessoa.getNome() + ": $ %.2f", pessoa.calculaImposto()));
			somaImpostos += pessoa.calculaImposto();
		}
		System.out.println(String.format("TOTAL DE IMPOSTOS: $ %.2f", somaImpostos));
	}
}

package poo.trabalhador;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do departamento: ");
		String nomeDepartamento = sc.next();
		System.out.println("Digite os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Nível: ");
		String nivel = sc.next();
		System.out.print("Salário base: ");
		Double salarioBase = sc.nextDouble();
		System.out.print("Quantos contratos para esse trabalhador ? ");
		int totalContratos = sc.nextInt();
		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel), salarioBase, new Departamento(nomeDepartamento));
		for(int i = 1; i <= totalContratos; i++) {
			System.out.println("Dados do contrato #"+i);
			System.out.print("Data: (DD/MM/YYYY): ");
			LocalDate dataContrato = LocalDate.parse(sc.next());
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			System.out.print("Duração (Horas): ");
			Integer duracao = sc.nextInt();
			trabalhador.adicionaContrato(new Contrato(dataContrato, valorPorHora, duracao));
		}
		System.out.print("Digite o mês e o ano para calcular o tota (MM/YYYY)");
		String mesAno = sc.next();
		String[] mesAnoSeparados = mesAno.split("/");
		Double valorTotal = trabalhador.valorTotal(Integer.valueOf(mesAnoSeparados[0]), Integer.valueOf(mesAnoSeparados[1]));
		System.out.println(trabalhador);
		System.out.println("Total de " + mesAno + ": "+valorTotal);
		sc.close();
		
		
	}
}

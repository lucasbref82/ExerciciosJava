package generics.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import generics.entidades.Produto;
import generics.service.CalculationService;

public class MainDelimitados {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		String path = "c:\\temp\\produtos.txt";
		List<Produto> produtos = new ArrayList<>();
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
			String linhas = bufferedReader.readLine();
			while(linhas != null) {
				String[] linha = linhas.split(",");
				produtos.add(new Produto(linha[0], Double.valueOf(linha[1])));
				linhas = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		CalculationService calculationService = new CalculationService();
		Produto produto = calculationService.max(produtos);
		System.out.println("Mais lucrativo: ");
		System.out.println(produto);
	}
}

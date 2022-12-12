package string;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		/* Funções uteis para string */
		String nome = "Lucas Brenner Ferreira ";
		String nomeMinusculo = nome.toLowerCase();
		String nomeMaiusculo = nome.toUpperCase();
		String nomeTrim = nome.trim();
		String nomeSubstring = nome.substring(2);
		String nomeSubstringLimite = nome.substring(2, 9);
		String nomeReplace = nome.replace("a", "h");
		int index = nome.indexOf("nn");
		int indexLast = nome.lastIndexOf("ra");
		String[] nomeSplit = nome.split(" ");
		
		System.out.println("--------- Resultados ----------");
		System.out.println("Original: " + nome);
		System.out.println("Minusculo: " + nomeMinusculo);
		System.out.println("Maiusculo: " + nomeMaiusculo);
		System.out.println("Espaços: " + nomeTrim);
		System.out.println("Recortando: " + nomeSubstring);
		System.out.println("Recortando com limites: " + nomeSubstringLimite);
		System.out.println("Substituindo a por h " + nomeReplace);
		System.out.println("Index :  " + index);
		System.out.println("Ultimo index:  " + indexLast);
		for (int i = 0; i < nomeSplit.length; i ++) {
			System.out.println("Posição "+ i + " " + nomeSplit[i]);
		}
		
		

	}

}

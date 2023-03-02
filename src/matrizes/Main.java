package matrizes;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrix = new int[n][m];
		for(int i = 0; i < matrix.length ; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int numero = sc.nextInt();
		
		for(int i = 0; i < matrix.length ; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == numero) {
					System.out.println("Posi��o " + i +", " + j);
					if(j > 0) {
						System.out.println("Esquerda: " + matrix[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Acima: " + matrix[i-1][j]);
					}
					if(j < matrix.length - 1) {
						System.out.println("Direita: " + matrix[i][j+1]);
					}
					if (i < matrix.length-1) {
						System.out.println("Abaixo: " + matrix[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}

}

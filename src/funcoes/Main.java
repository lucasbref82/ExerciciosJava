package funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double max = maior(x, y, z);
		mostraMaior(max);
		sc.close();
	}
	
	public static double maior(double x, double y, double z) {
		double max;
		if(x > y && x > z) {
			max = x;
		}else if(y > z) {
			max = y;
		}else {
			max = z;
		}
		return max;
	}
	
	public static void mostraMaior(double max) {
		printa("O maior valor é : %.0f", max);
	}
	
	public static void printa(String mensagem, double max) {
		System.out.printf(mensagem, max);
	}

}

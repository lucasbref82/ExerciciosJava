package arquivos;

import java.io.File;
import java.util.Scanner;

public class TreinandoFile {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o caminho do arquivo.");
		String srtPath = sc.nextLine();
		File path = new File(srtPath);
		File[] folders = path.listFiles(File::isDirectory);
		for (File file : folders) {
			System.out.println(file);
		}
		
		System.out.println("------------------");
		
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println("------------------");
		
		boolean sucess = new File(srtPath + "\\novoDiretorio").mkdir();
		System.out.println("Diretorio criado com sucesso: " + sucess);
	}
}

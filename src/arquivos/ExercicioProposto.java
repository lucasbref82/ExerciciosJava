package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ExercicioProposto {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		String path = "c:\\temp";
		List<Produto> produtos = new ArrayList<>();
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "\\source.txt"))){
				String line = bufferedReader.readLine();
				while(line != null) {
					String[] lines = line.split(",");
					Produto produto = new Produto(lines[0], Double.valueOf(lines[1]), Integer.valueOf(lines[2]));
					produtos.add(produto);
					line = bufferedReader.readLine();
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		boolean exists = new File(path + "\\out").exists();
		if(!exists) {
			boolean sucess = new File(path + "\\out").mkdir();
			System.out.println("Sucesso: " + sucess);
		}
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\temp\\out\\summary.csv", true))) {
			for (Produto produto : produtos) {
				bufferedWriter.write(produto.getNome());
				bufferedWriter.write(",");
				bufferedWriter.write(String.format("%.2f", produto.calcularTotal()));
				bufferedWriter.newLine();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
}

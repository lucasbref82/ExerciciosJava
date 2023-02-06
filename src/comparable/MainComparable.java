package comparable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {
	
	public static void main(String[] args) {
		String path = "c:\\temp\\in.txt";
		List<Empregado> empregados = new ArrayList<>();
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
			String line = bufferedReader.readLine();
			while(line != null) {
				String[] empregado = line.split(",");
				empregados.add(new Empregado(empregado[0], Double.valueOf(empregado[1])));
				line = bufferedReader.readLine();
			}
		Collections.sort(empregados);
		for (Empregado empregado : empregados) {
			System.out.println("Nome: "+empregado.getNome() + ", Salário: "+empregado.getSalario());
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

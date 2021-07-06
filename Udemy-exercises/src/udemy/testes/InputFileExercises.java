package udemy.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputFileExercises {

	public static void main(String[] args) throws IOException {
		InputStream fs = new FileInputStream("teste.txt"); // retorna os dados em bytes
		Reader isr = new InputStreamReader(fs);
		BufferedReader bf = new BufferedReader(isr);
		
		String linha = bf.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = bf.readLine();
		}
		
		
		bf.close();
	}

}

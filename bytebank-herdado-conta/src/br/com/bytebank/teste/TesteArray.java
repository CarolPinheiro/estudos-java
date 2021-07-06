package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;

public class TesteArray {
	public static void main(String[] args) {
		//array de idades
		int[] idades = new int[5];
		
		for(int i = 0; i<idades.length; i++) {
			idades[i] = idades.length + i;
			System.out.println(idades[i]);
		}
	 
		int[] refs = {1,2,3,4};// outra forma de declarar arrays
		
		System.out.println(refs[1]);
		
		System.out.println(idades);
	     
	     
		//array de referências
		ContaCorrente[] arrayCC = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(22,22);
		
		arrayCC[0] = cc1;
		
		
		
		
//		System.out.println(arrayCC[0]);
	}

}
 
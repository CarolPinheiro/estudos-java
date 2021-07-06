package br.com.bytebank.teste;

import java.util.Comparator;

import br.com.bytebank.modelo.Conta;

public class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c2.getNumero(), c1.getNumero());
	}
	
	

}

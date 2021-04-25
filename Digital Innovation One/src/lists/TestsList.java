package lists;

import java.util.ArrayList;
import java.util.List;

public class TestsList {
	
	public static void main(String[] args) {
	
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Spock");
		nomes.add("Kirk");
		nomes.add("McCoy");
		nomes.add("Sulu");
		nomes.add("Chekov");
		
		System.out.println(nomes);
		
		
		String nome1 = nomes.get(2);
		
		System.out.println(nome1);
		
		nomes.set(3, "Uhura");
		System.out.println(nomes);
		
		nomes.remove(3);
		System.out.println(nomes);

		nomes.remove("Kirk");
		System.out.println(nomes);
		
		int tamanho = nomes.size();
		System.out.println(tamanho);
		
		boolean contem = nomes.contains("Kirk");
		
		List<String> novaListaDeNomes= new ArrayList<>();
		
		novaListaDeNomes.add("Malcolm");
		novaListaDeNomes.add("Seongjae");
		novaListaDeNomes.add("Aanga");
		novaListaDeNomes.add("Anjulie");
		
		nomes.addAll(novaListaDeNomes);
		nomes.sort(null);
		
		boolean vazio = novaListaDeNomes.isEmpty();
		
		System.out.println(vazio);
		
		System.out.println(nomes);
		
		
		

		
		
		
	}

}

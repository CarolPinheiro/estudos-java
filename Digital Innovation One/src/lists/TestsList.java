package lists;

import java.util.ArrayList;
import java.util.List;

public class TestsList {
	
	public static void main(String[] args) {
	
		List<String> nomes = new ArrayList<>();
		List<Long> testeGrande = new ArrayList<>();
		List<List<Integer>> matriz = new ArrayList<>();

		matriz.add(new ArrayList<>(){
			{
				add(3);
			}
		});
		matriz.add(new ArrayList<>(){
			{
				add(1);
				add(3);
				add(2);
			}
		});
		matriz.add(new ArrayList<>(){
			{
				add(2);
				add(5);
				add(6);
			}
		});
		matriz.add(new ArrayList<>(){
			{
				add(7);
				add(9);
				add(5);
			}
		});


		testeGrande.add(1000000005L);
		testeGrande.add(1000000004L);
		testeGrande.add(10000000066L);
		testeGrande.add(10000000345L);


		nomes.add("Spock");
		nomes.add("Kirk");
		nomes.add("McCoy");
		nomes.add("Sulu");
		nomes.add("Chekov");
		
		
		String nome1 = nomes.get(2);
		

		nomes.set(3, "Uhura");

		
		nomes.remove(3);


		nomes.remove("Kirk");

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

		long resultSum = 0l;

		for( long result: testeGrande ){
			resultSum+=result;
		}
		int i = 0;
		List<List<Integer>> total = matriz;
		int difference = 0;
		int leftSum = 0;
		int rightSum = 0;
		do {
			leftSum+=matriz.get(i+1).get(i);
			rightSum+=matriz.get(matriz.size() - i - 1).get(matriz.size() - i - 2);
			System.out.println(matriz.get(i+1).get(i));
			i++;
		}
		while(i< total);

		difference = Math.abs(leftSum - rightSum);
//		System.out.println(matriz.size());
		
		
		
	}

}


public class TestaCondicional2 {

	public static void main(String[] args) {
		int idadeMinima = 18;
		int idadeAtual = 2;
		int quantidadeDePessoas = 0;
		
		boolean acompanhado = quantidadeDePessoas >=2;

		if (idadeAtual >= idadeMinima && acompanhado)
			System.out.println("Você está na idade adequada!");
		else {
			System.out.println("Você não está na idade adequada!");
		}
	}
}

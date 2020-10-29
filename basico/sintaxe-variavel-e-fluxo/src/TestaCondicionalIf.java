
public class TestaCondicionalIf {

	public static void main(String[] args) {
		System.out.println("teste com atalhos");

		int idadeMinima = 18;
		int idadeAtual = 2;

		if (idadeAtual >= idadeMinima)
			System.out.println("Você está na idade adequada!");
		else {
			System.out.println("Você não está na idade adequada!");
		}
	}
}

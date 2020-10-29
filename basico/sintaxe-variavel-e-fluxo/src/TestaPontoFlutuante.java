
public class TestaPontoFlutuante {
	public static void main (String[] args) {
		double salario = 1250.0; // double aceita números decimais
		
		System.out.println(salario);
		
		int divisaoInteiros = 5/2; // O Java compila da direita pra esquerda, então mesmo se o resultado tiver vírgula, ele vai entregar apenas o valor inteiro.
		
		double divisaoInteirosComDouble = 5/2; // Mesmo nesse caso, ele vai arredondar para o inteiro apenas pela questão da direção de leitura.
		
		double novadivisaoInteirosComDouble = 5.0/2; // Contudo, se indicarmos com um ponto que aquele número tem ponto flutuante, o resultado com decimal será apresentado.
		
		System.out.println(novadivisaoInteirosComDouble);
		System.out.println(divisaoInteirosComDouble);
		System.out.println(divisaoInteiros);
		
	}
}

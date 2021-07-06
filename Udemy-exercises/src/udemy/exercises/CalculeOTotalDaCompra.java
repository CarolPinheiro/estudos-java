package udemy.exercises;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
 */

public class CalculeOTotalDaCompra {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int quantidadeProdutoA = sc.nextInt();
		double precoProdutoA= sc.nextDouble();
		sc.nextInt();
		int quantidadeProdutoB = sc.nextInt();
		double precoProdutoB= sc.nextDouble();
		
		double result = quantidadeProdutoA*precoProdutoA + quantidadeProdutoB*precoProdutoB;
		
		
		System.out.printf("O pre�o a pagar � R$%.2f", result);
		
		sc.close();
	}

}

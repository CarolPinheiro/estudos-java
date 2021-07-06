package udemy.exercises;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
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
		
		
		System.out.printf("O preço a pagar é R$%.2f", result);
		
		sc.close();
	}

}

package udemy.exercises;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

 */

public class CalculoAreaDeCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		
		double resultado = pi * raio * raio;
		
		System.out.printf("A= %.4f", resultado);
		
		sc.close();
	}

}

package udemy.exercises;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

 */

public class HorasTrabalhadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int numeroDoFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double porHora = sc.nextDouble();
		
		
		double resultado = horasTrabalhadas * porHora;
		
		System.out.printf("NUMERO = %d %n SALARIO= R$ %.2f", numeroDoFuncionario,  resultado);
		
		sc.close();
	}

}

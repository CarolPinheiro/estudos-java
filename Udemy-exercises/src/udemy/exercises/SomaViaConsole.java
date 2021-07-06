package udemy.exercises;

import java.util.Scanner;

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos
 *
 */
public class SomaViaConsole{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		
		int result = value1 + value2;
		
		System.out.println("SOMA: "+ result);
		
		sc.close();

	}

}

package udemy.testes;

import java.util.Scanner;

public class ScannerExercises {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int y = sc.nextInt();
		double z = sc.nextDouble();
//		System.out.println("Você escreveu: " + x);
		
		System.out.println("Resultados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}

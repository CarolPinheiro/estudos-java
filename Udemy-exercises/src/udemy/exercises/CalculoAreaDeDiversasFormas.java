package udemy.exercises;

import java.util.Locale;
import java.util.Scanner;

/*
 *Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

 */

public class CalculoAreaDeDiversasFormas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double resultadoTriangulo = A * C / 2;
		double resultadoRaio = C * C * 3.14159;
		double resultadoTrapezio = ((A+B) * C)/2;
		double resultadoQuadrado = B*B;
		double resultadoRetangulo = A*B;
		
		System.out.printf("TRIÂNGULO = %.3f  %n"
				+ "CIRCULO = %.3f  %n"
				+ "TRAPEZIO = %.3f  %n"
				+ "QUADRADO = %.3f  %n"
				+ "RETANGULO = %.3f  %n", resultadoTriangulo, resultadoRaio, resultadoTrapezio, resultadoQuadrado, resultadoRetangulo);
		
		sc.close();
	}

}

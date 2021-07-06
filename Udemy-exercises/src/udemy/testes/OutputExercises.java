package udemy.testes;

import java.util.Locale;

public class OutputExercises {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 23;
		int code = 51665;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 234234.30;
		double measure = 52.232456234;
		
		System.out.printf("Products:%n %s which price is $%.2f %n %s, which price is $ %.2f", product1, price1, product2, price2);
		System.out.printf("%n Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f %n Rounded (three decimal places): %.3f", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point: %.3f", measure);
	}

}

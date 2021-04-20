import java.util.Arrays;

public class TesteStrings {

	public static void main(String[] args) {
		String str = "Carol Pinheiro";
		System.out.println(Arrays.toString(str.toCharArray()));
		System.out.println(Arrays.toString("Aula de Java".split(" ")));
		System.out.println("Aula".concat(" de Java"));
		System.out.println("1234 asda33 qw".replaceAll("[0-9]", "#"));

	}

}

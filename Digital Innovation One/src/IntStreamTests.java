import java.util.stream.IntStream;

public class IntStreamTests {

	public static void main(String[] args) {
//		IntStream.of(1,2,3,4,5).forEach(n-> {
//			System.out.println(n);
//		});
//		
		IntStream.range(0, 20).forEach(System.out::println);

	}

}

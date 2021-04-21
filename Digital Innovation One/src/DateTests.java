import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTests {
	public static void main(String[] args) throws ParseException {
		long date = System.currentTimeMillis();
		
		Date newDate = new Date (date);
		
		System.out.println(newDate);
		
		//convert a date to milliseconds and then compare them with another date
		
		
		String bornDate = "27/05/1998 23:55:00";
		SimpleDateFormat bornDateMls = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dateTest = bornDateMls.parse(bornDate);
		System.out.println(dateTest);
		
		
		boolean isAfter = dateTest.after(newDate);
		boolean isBefore = dateTest.before(newDate);
		
		System.out.println(isBefore);
		System.out.println(isAfter);
	}

}

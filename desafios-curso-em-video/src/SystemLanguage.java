import java.util.Locale;

public class SystemLanguage {
	public static void main(String[] args) {
		String language = System.getProperty("user.language");
		Locale locale = Locale.getDefault();
		String lang = locale.getDisplayLanguage();
		String country = locale.getDisplayCountry();
		System.out.println(country);
		
		
		System.out.println(language);
	}
}

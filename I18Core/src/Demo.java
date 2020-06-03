import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {

	public static void main(String[] args) {
		
		// create local object
		Locale locUS = new Locale("en", "US");
		Locale locIND = new Locale("in", "IN");
		Locale locIT = new Locale("it", "IT");
		Locale locTK = new Locale("tk", "TK");
		
		// create NumberFormat class object
		NumberFormat nfUS = NumberFormat.getInstance(locUS);
		NumberFormat nfIND = NumberFormat.getInstance(locIND);
		
		System.out.println(nfUS.format(1234567893.776896));
		System.out.println(nfIND.format(1234567893.776896));
		
		// create DateFormat Class object
		DateFormat dfUS = DateFormat.getDateInstance(0, locUS);
		System.out.println(dfUS.format(new Date()));
	
		DateFormat dfIT = DateFormat.getDateInstance(0, locIT);
		System.out.println(dfIT.format(new Date()));
		
		// create ResourceBundle Class object
		// welcome message for US
		ResourceBundle rbUS = ResourceBundle.getBundle("com/nit/resources/ripon", locUS);
		System.out.println(rbUS.getString("welcome msg"));
		
		// welcome message for Italy
		ResourceBundle rbIT = ResourceBundle.getBundle("com/nit/resources/ripon", locIT);
		System.out.println(rbIT.getString("welcome msg"));
		
		// welcome message for Turkey
		ResourceBundle rbTK = ResourceBundle.getBundle("com/nit/resources/ripon", locTK);
		System.out.println(rbTK.getString("welcome msg"));
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

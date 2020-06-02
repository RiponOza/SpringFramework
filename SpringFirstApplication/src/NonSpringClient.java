import com.nit.beans.DemoBean;

public class NonSpringClient {

	public static void main(String[] args) {
		
		DemoBean d = new DemoBean();
		d.setMessage("Hey Im a non Spring Client.");
		d.displayMessage();
	}
}

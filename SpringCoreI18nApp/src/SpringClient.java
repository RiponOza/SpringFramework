import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.spring.beans.I18NBean;

public class SpringClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/spring/config/Spring.xml");
		I18NBean i18n = (I18NBean) context.getBean("i18n");
		i18n.displayMessge();
	}

}

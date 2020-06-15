import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ripon.spring.beans.Customer;
import com.ripon.spring.beans.SpringBeanPostProcessor;
import com.ripon.spring.config.AppConfig;

public class SpringClient {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Customer customer = (Customer) context.getBean("cust");
		
		context.close();
		
	}

}

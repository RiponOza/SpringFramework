import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.beans.DemoBean;

public class SpringClient {

	public static void main(String[] args) {
		
		//1. Identifying name and location of Spring configuration file using Resource reference
		Resource resource = new ClassPathResource("com/nit/config/Spring.xml");
		
		//2. Creating bean factory container object
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//3. Getting the spring bean object from container
		Object object = factory.getBean("db");
		
		//4. Typecast to DemoBean class
		DemoBean d = (DemoBean) object;
		
		//5. Call the business method
		d.displayMessage();
	}

}

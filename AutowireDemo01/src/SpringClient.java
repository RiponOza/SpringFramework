import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.beans.SampleBean;

public class SpringClient {

	public static void main(String[] args) {

		// creating resource object to identify spring config object
		Resource resource = new ClassPathResource("com/nit/config/Spring.xml");
		
		// creating beanfactory object
		BeanFactory factory = new XmlBeanFactory(resource);
		
		SampleBean sb = (SampleBean) factory.getBean("sample");
	
		sb.showSampleBean();
		
	}

}

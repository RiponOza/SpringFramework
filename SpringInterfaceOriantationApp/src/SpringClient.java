import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.spring.beans.ReportService;


public class SpringClient {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("com/nit/spring/config/Spring.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		ReportService rs = (ReportService) factory.getBean("reportService");
		
		rs.showReport();
		
	}

}

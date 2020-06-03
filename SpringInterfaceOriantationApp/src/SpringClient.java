import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.spring.beans.ReportService;


public class SpringClient {

	public static void main(String[] args) {
		
		/*
		  Resource resource = new ClassPathResource("com/nit/spring/config/Spring.xml");
		  
		  BeanFactory factory = new XmlBeanFactory(resource);
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/spring/config/Spring.xml");
		
		ReportService rs = (ReportService) context.getBean("reportService");
		
		rs.showReport();
		
	}

}

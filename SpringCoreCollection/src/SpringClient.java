import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.spring.beans.SimpleBean;

public class SpringClient {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("com/nit/spring/config/spring.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		SimpleBean bobj = (SimpleBean) factory.getBean(SimpleBean.class);
		
		bobj.displayDate();
		bobj.displayCitis();
		bobj.displayCourseList();
		bobj.displayEmpId();
		bobj.displayEmpInfo();
		bobj.displayDatabaseDetails();

	}

}

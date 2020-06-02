import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.beans.AddressBean;
import com.nit.beans.CustomerBean;
import com.nit.beans.EmployeeBean;

public class SpringClient {

	public static void main(String[] args) {
		
		// creating resource object to identify spring config object
		Resource resource = new ClassPathResource("com/nit/config/Spring.xml");
		
		// creating beanfactory object
		BeanFactory factory = new XmlBeanFactory(resource);
		
		// getting the spring bean objects from container using id
		EmployeeBean employee = (EmployeeBean) factory.getBean("emp");
		AddressBean address = (AddressBean) factory.getBean("add");
		System.out.println(employee);
		System.out.println(address);
		System.out.println("===========================================");
		
		// getting the spring bean objects from container using name
		EmployeeBean employee2 = (EmployeeBean) factory.getBean("employee");
		AddressBean address2 = (AddressBean) factory.getBean("address");
		System.out.println(employee2);
		System.out.println(address2);
		System.out.println("===========================================");
		
		// getting the spring bean objects from container using classname
		EmployeeBean employee3 = (EmployeeBean) factory.getBean(EmployeeBean.class);
		AddressBean address3 = (AddressBean) factory.getBean(AddressBean.class);
		System.out.println(employee3);
		System.out.println(address3);
		System.out.println("===========================================");
	
		CustomerBean customer01 = (CustomerBean) factory.getBean("cust");
		System.out.println(customer01);
	
	
	}

}

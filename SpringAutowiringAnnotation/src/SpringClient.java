import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripon.spring.beans.Employee;

public class SpringClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ripon/spring/config/Spring.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		
		emp.displayEmployee();
	}

}

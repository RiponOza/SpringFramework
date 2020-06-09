import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ripon.spring.beans.Department;
import com.ripon.spring.beans.Employee;
import com.ripon.spring.config.SpringConfigApp;

public class SpringClient {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigApp.class);

		Employee emp = (Employee)ac.getBean("emp");
		emp.displayEmployee();
		
		System.out.println("\n");
		
		Employee emp1 = (Employee)ac.getBean("emp");
		System.out.println(emp1.hashCode());
		Employee emp2 = (Employee)ac.getBean("emp");
		System.out.println(emp2.hashCode());
		Employee emp3 = (Employee)ac.getBean("employee");
		System.out.println(emp3.hashCode());
		Employee emp4 = (Employee)ac.getBean("employee");
		System.out.println(emp4.hashCode());

	}

}

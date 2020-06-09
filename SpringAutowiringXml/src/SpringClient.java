import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.spring.beans.Student;

public class SpringClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/spring/config/Spring.xml");

		Student student = (Student) context.getBean("student");
		
		student.displayStudentInfo();
		
	}

}

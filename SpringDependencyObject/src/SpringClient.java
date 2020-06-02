import java.sql.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nit.spring.beans.Course;
import com.nit.spring.beans.Student;

public class SpringClient {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("com/nit/spring/config/Spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student student = (Student) factory.getBean(Student.class);
		Course course = (Course) factory.getBean(Course.class);
		
		System.out.println(student);
		course.displayCourseList();
	}

}

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
		
		Student student01 = (Student) factory.getBean("stu001");
		Course course01 = (Course) factory.getBean("crs001");
		System.out.println(student01);
		course01.displayCourseList();
		System.out.println("\n\n");
		
		Student student02 = (Student) factory.getBean("stu002");
		Course course02 = (Course) factory.getBean("crs002");
		System.out.println(student02);
		course02.displayCourseList();
		System.out.println("\n\n");
	}

}

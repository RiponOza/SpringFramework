import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripon.spring.beans.DemoBean;
import com.ripon.spring.beans.TestBean;

public class SpringClient {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/ripon/spring/config/Spring.xml");
		DemoBean demo = (DemoBean) context.getBean("demo");
		System.out.println(demo.getMessage());
		
		System.out.println();
		
		TestBean test = (TestBean) context.getBean("test");
		System.out.println(test.getA());
		
		context.close();
	}

}

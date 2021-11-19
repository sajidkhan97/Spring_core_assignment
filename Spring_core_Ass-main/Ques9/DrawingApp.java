package Com.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		System.out.println("Hello World");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		context.registerShutdownHook();
	     Student s =(Student) context.getBean("student");
	     s.draw();
	}

}



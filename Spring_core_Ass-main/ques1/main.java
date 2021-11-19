package springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("CustomerAddress.xml");
	     Customer obj= (Customer) factory.getBean("customer");
	     obj.details();
	}

}

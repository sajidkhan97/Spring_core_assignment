package springs.ques2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs.Customer;

public class Test {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("Question.xml");
	     Questions obj= (Questions) factory.getBean("question");
	    obj.disp();
	     
	}
}

package Com.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

public class Student {
	private String type;

	public Student(String type) {
		this.type = type;
		
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}
	
	 @Resource
	  public void setType(String type) 
	  {
		  this.type = type;
	  }
	 
	public void draw()
	{
		System.out.println (" Triangle Drawn " +getType());
	}
	
	public void intialize()
	{
		System.out.println("Init Of circle");
	}
	
	public void destroy()
	{
		System.out.println("Init Of circle");
	}
}

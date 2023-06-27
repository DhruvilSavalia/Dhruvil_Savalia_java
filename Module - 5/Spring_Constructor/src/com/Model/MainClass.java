package com.Model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
		Person per = (Person) con.getBean("t1");
		
		per.display();
		
	}

}

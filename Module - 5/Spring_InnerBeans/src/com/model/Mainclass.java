package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
		Person per = (Person) con.getBean("One");
		
		per.display();
		
	}

}

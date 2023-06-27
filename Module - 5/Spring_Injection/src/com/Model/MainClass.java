package com.Model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
		info ino = (info)con.getBean("information");
		System.out.println(ino.getName()+" "+ino.getName());
	}

}

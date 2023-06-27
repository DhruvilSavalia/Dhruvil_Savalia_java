package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
		Model m = (Model)con.getBean("student");
		
		System.out.println(m.getList1());
		System.out.println(m.getList2());
		System.out.println(m.getList3());
		System.out.println(m.getList4());
		System.out.println(m.getList5());
		
	}

}

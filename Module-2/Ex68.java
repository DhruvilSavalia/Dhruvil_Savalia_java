package javaprograms;

import java.util.ArrayList;

public class Ex68 
{
	public static void main(String[] args) 
	{
		 ArrayList <Integer> l = new ArrayList<>();
		 l.add(10);
		 l.add(20);
	     l.add(30);
		 l.add(40);
		 l.add(50);
		 
		 System.out.println("ArrayList is :"+l);
		 l.ensureCapacity(8);
		 l.add(60);
		 l.add(70);
		 l.add(80);
		 
		 System.out.println("New ArrayList is :"+l);
			
	}
    
    
	

}

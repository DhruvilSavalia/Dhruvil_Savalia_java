package javaprograms;

import java.util.ArrayList;

public class Ex69 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println("ArrayList is :"+l);
		l.set(3, 100);
		System.out.println("ArrayList is :"+l);
		
	}

}

package javaprograms;

import java.util.ArrayList;

public class Ex70 
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
	
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	
  }
}

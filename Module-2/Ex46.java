package javaprograms;

import java.util.ArrayList;

public class Ex46 
{
	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("Red");
		l.add("Orange");
		l.add("Blue");
		l.add("White");
		l.add("Black");
		l.add("Yellow");
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		
	}

}

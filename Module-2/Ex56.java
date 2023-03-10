package javaprograms;

import java.util.HashSet;
import java.util.Iterator;

public class Ex56 
{
	public static void main(String[] args) 
	{
		HashSet<String> H = new HashSet<>();
		
		H.add("Abhishek");
		H.add("Dev");
		H.add("Siddharth");
		H.add("Renish");
		H.add("Devarsh");
		H.add("Viki");
		
		Iterator i = H.iterator();
		
		while(i.hasNext())
		{
		   System.out.println(i.next());	
		}
		
		
		
	}

}

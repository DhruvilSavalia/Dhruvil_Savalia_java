package javaprograms;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex65 
{
	public static void main(String[] args) 
	{
		HashSet<String> S = new HashSet<String>();
		S.add("1");
		S.add("10");
		S.add("20");
		S.add("30");
		S.add("12");
		
		System.out.println("HashSet Contains :"+S);
		String arry[] = new String[S.size()];
		
		S.toArray(arry);
		
		for (String n : arry)
		{
			System.out.println(n);
		}
			
		
	}

}

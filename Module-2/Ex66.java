package javaprograms;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex66 
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
		
		System.out.println("HashSet :"+H);
		ArrayList<String> L = new ArrayList<>(H); 
		
		System.out.println("ArrayList is :"+L);
		
	}

}

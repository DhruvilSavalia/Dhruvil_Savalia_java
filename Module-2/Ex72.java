package javaprograms;

import java.util.HashMap;

public class Ex72 
{
	public static void main(String[] args) 
	{
		HashMap<Integer , String> h = new HashMap<>();
		h.put(1, "Siddharth");
		h.put(2, "Abhishek");
		h.put(3, "Dev");
		h.put(4, "John");
		h.put(5, "Jill");
		System.out.println("Collection view is :"+h.values());
		
		
	}

}

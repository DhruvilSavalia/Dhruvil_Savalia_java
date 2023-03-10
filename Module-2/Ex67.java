package javaprograms;

import java.util.HashMap;

public class Ex67 
{
	public static void main(String[] args) 
	{
		HashMap<Integer , String> h =  new HashMap<>();
		h.put(1, "Siddharth");
		h.put(2, "Abhishek");
		h.put(3, "Dev");
		h.put(4, "Darshan");
		h.put(5, "Arijit");
		System.out.println("HashMap :"+h.keySet() +h.values());
		
		boolean l = h.isEmpty();
		System.out.println("Map is empty :"+l);
		h.clear();
		l = h.isEmpty();
		System.out.println("Map is empty :"+l);
		
	}

}

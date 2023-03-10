package javaprograms;

import java.util.HashSet;

public class Ex71 
{
	public static void main(String[] args) 
	{
		HashSet<String> h = new HashSet<>();
		
		h.add("Siddharth");
		h.add("Abhishek");
		h.add("Dev");
		h.add("Shyam");
		h.add("Jill");
		
		System.out.println("First HashSet :"+h);
		
		HashSet<String> h1 = new HashSet<>();
		
		h1.add("Siddharth");
		h1.add("Abhishek");
		h1.add("Krishna");
		h1.add("john");
		h1.add("Dhyey");
		
		System.out.println("First HashSet :"+h1);
		h.retainAll(h1);
		System.out.println("retain elements :"+h);
		
		
		
	}

}

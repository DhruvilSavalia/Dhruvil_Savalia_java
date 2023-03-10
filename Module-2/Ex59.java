package javaprograms;

import java.util.HashMap;

public class Ex59 
{
	public static void main(String[] args) 
	{
		HashMap<Integer , String> H = new HashMap<>();
		H.put(1, "Siddharth");
		H.put(2, "Abhishek");
		H.put(3, "Dev");
		H.put(4, "Darshan");
		H.put(5, "Arijit");
		System.out.println("HashMap :"+H.keySet() +H.values());
		System.out.println("HashMap size :"+H.size());
		
		
		
	}

}

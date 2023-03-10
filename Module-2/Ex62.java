package javaprograms;

import java.util.ArrayList;

public class Ex62 
{
	public static void main(String[] args) 
	{
		ArrayList<String> I1 = new ArrayList<>();
		I1.add("Mumbai");
		I1.add("Rajkot");
		I1.add("Pune");
		I1.add("Banglore");
		
		ArrayList<String> I2 = new ArrayList<>();
		I2.add("Mumbai");
		I2.add("Rajkot");
		I2.add("Pune");
		I2.add("Banglore");
		
		boolean list = I1.equals(I2);
		
		System.out.println(list);
		
		
		
		
	}

}

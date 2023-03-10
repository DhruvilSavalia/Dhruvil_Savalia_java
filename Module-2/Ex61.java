package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Ex61 
{
	public static void main(String[] args) 
	{
		ArrayList<String> I = new ArrayList<>();
		I.add("Mumbai");
		I.add("Vadodara");
		I.add("Rajkot");
		I.add("Ahmedabad");
		I.add("Pune");
		I.add("Banglore");
		
		System.out.println("List :"+I);
		List<String> I1 = I.subList(0, 3);
		System.out.println("Extract List is :"+I);
		
		
	}

}

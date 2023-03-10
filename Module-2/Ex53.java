package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Ex53 
{
	public static void main(String[] args) 
	{
		ArrayList<String> I = new ArrayList<>();
		
		I.add("Rajkot");
		I.add("Mumbai");
		I.add("Ahmedabad");
		I.add("Surat");
		I.add("Bhavnagar");
		
		System.out.println("First List :"+I);
		
		ArrayList<String> I1 = new ArrayList<>();
		I1.add("Vadodara");
		I1.add("Gandhinagar");
		I1.add("Bhuj");
		I1.add("Pune");
		
		System.out.println("Second List :"+I1);
		
		Collections.copy(I, I1);
		
		System.out.println("First List :"+I);
		
		System.out.println("Second List :"+I1);
		
		
	
	}

}

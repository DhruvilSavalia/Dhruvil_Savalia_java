package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Ex54 
{
	public static void main(String[] args) 
	{
		ArrayList<String> I = new ArrayList<>();
		
		I.add("Mumbai");
		I.add("Jammu & Kashmir");
		I.add("Banglore");
		I.add("Rajasthan");
		I.add("Chennai");
		I.add("Pune");
		
		System.out.println("List :"+I);
		Collections.shuffle(I);
		System.out.println("Shuffle array :"+I);
		
		
	}

}

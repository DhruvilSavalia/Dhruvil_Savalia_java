package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Ex52 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> I = new ArrayList<>();
		
		I.add(1);
		I.add(98);
		I.add(24);
		I.add(66);
		I.add(78);
		I.add(22);
		I.add(56);
		I.add(45);
		
		System.out.println("Before sorting :"+I);
		Collections.sort(I, Collections.reverseOrder());
		
		System.out.println("After sorting :"+I);
	
		
	}

}

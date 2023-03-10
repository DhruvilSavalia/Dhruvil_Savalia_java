package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Ex63 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> I = new ArrayList<>();
		I.add(10);
		I.add(20);
		I.add(30);
		I.add(40);
		I.add(50);
		
		System.out.println("Before Swapping :"+I);
		
		Collections.swap(I, 3, 4);
		System.out.println("After Swapping :"+I);
		
		
	}

}

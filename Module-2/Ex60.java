package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Ex60 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> I = new ArrayList<>();
		I.add(32);
		I.add(5);
		I.add(72);
		I.add(90);
		I.add(45);
		I.add(6);
		I.add(0);
		I.add(9);
		System.out.println("List :"+I);
		Collections.reverse(I);
		System.out.println("Reverse  elements in list :"+I);
		
	}

}

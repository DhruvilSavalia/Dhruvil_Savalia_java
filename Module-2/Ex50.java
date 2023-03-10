package javaprograms;

import java.util.ArrayList;

public class Ex50 
{
	public static void main(String[] args) 
	{
		ArrayList<String> I = new ArrayList<>();
		I.add("Orange");
		I.add("Green");
		I.add("Black");
		I.add("Red");
		I.add("Blue");
		I.add("White");
		I.add("Yellow");
		
		System.out.println(I);
		I.remove(2);
		System.out.println(I);
		
	}

}

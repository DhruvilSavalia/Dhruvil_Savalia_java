package javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex51 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> I = new ArrayList<>();
		
		I.add("Orange");
		I.add("Green");
		I.add("Black");
		I.add("Red");
		I.add("Blue");
		I.add("White");
		I.add("Yellow");
		System.out.println(I);
		
		System.out.println("Enter the element :");
		String a = sc.next();
		
		if(I.contains(a))
		{
			System.out.println("Search element is :"+a);
		}
		else
		{
			System.out.println("Not found");
		}
		
	}

}

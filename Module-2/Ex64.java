package javaprograms;

import java.util.ArrayList;

public class Ex64 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> I = new ArrayList<>();
		I.add(10);
		I.add(20);
		I.add(30);
		I.add(40);
		I.add(50);
		
		System.out.println("List 1 :"+I);
		ArrayList<Integer> I1 = new ArrayList<>();
		I1.add(60);
		I1.add(70);
		I1.add(80);
		I1.add(90);
		I1.add(100);
		
		System.out.println("List 2 :"+I1);
		
		ArrayList<Integer> L = new ArrayList<>();
		L.addAll(I);
		L.addAll(I1);
		System.out.println("New List :"+L);
		
		
		
	}

}

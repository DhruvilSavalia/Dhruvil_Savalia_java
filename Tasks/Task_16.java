package javaprograms;

import java.util.Scanner;

public class Task_16 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1) for area of triangle.\n2) for area of rectangle.\n3) for area of circle.");
		
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		
		if(number==1)
		{
			System.out.println("Enter the height :");
			float h = sc.nextFloat();
			
			System.out.println("Enter the base :");
			float b = sc.nextFloat();
			
			float ar_of_tri = (h*b)/2;
			System.out.println("The area of triangle is :"+ar_of_tri);
		}
		if(number==2)
		{
			System.out.println("Enter the width :");
			float w = sc.nextFloat();
			
			System.out.println("Enter the length");
			float h1 = sc.nextFloat();
			
			float ar_of_rect = (w * h1);
			
			System.out.println("The area of the rectangle is :"+ar_of_rect);
		}
		if(number==3)
		{
			System.out.println("Enter the radius :");
			float r = sc.nextFloat();
			
			float ar_of_cir = (r*r)*22/7;
			System.out.println("The area of the circle is :"+ar_of_cir);
		}
		
		
		
	} 

}

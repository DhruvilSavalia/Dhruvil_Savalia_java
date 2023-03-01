package javaprograms;

import java.util.Scanner;

public class Ex31_ii 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks :");
		float marks = sc.nextFloat();
		
		if(marks>=91 && marks<=100)
		{
			System.out.println("A Grade");
		}
		else if(marks>=81 && marks<=90)
		{
			System.out.println("B Grade");
		}
		else if(marks>=71 && marks<=80)
		{
			System.out.println("B Grade");
		}
		else if(marks>=61 && marks<70)
		{
			System.out.println("C Grade");
		}
		else if(marks>=51 && marks<60)
		{
			System.out.println("D Grade");
		}
		else if(marks>=41 && marks<50)
		{
			System.out.println("D Grade");
		}
		else if(marks<=40)
		{
			System.out.println("Fail");
		}
	}

}

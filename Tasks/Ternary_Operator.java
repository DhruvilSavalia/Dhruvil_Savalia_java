package Javaprograms;
import java.util.Scanner;
public class Ternary_Operator 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int First = sc.nextInt();
		System.out.println("Enter the Second number:");
		int Second = sc.nextInt();
		System.out.println("Enter the third number:");
		int Third = sc.nextInt();
		
		int no = (First>Second)? (First>Third ? First : Third):(Second>Third ? Second : Third);
		
		
		System.out.println("Maximum number is : "+no);		
		
	}
	
}

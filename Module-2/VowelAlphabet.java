package javaprograms;

import java.util.Scanner;

public class VowelAlphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any vowel and alphabet");
		String value = sc.next();
		
		if(value.length()>1)
		{
			System.out.println("error");
		}
		else if(value.equals("a")|| value.equals("e")|| value.equals("i")|| value.equals("o")|| value.equals("u")|| value.equals("A")|| value.equals("E")|| value.equals("I")|| value.equals("O")|| value.equals("U"))
		{
			System.out.println("Vowel");
		}
		else if(!(value.charAt(0)>=65 && value.charAt(0)<=90 || value.charAt(0)>=97 && value.charAt(0)<=122))
		{
			System.out.println("Error");
		}
		else
		{
			System.out.println("Alphabet");
		}
		
	} 

}

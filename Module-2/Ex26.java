package javaprograms;

import java.util.Scanner;

class complex
{
	int real , imaginary;
	
	complex(int tempreal , int tempimaginary)
	{
		real = tempreal;
		imaginary = tempimaginary;
	}
	public complex(){
	}
		complex addition(complex c1 , complex c2)
		{
			complex temp = new complex();
			
			temp.real = c1.real+c2.real;
			temp.imaginary = c1.imaginary+c2.imaginary;
			
			return temp;
		}
		
		complex subtraction(complex c1 , complex c2)
		{
			complex temp = new complex();
			
			temp.real = c1.real - c2.real;
			temp.imaginary = c1.imaginary - c2.imaginary;
			return temp;
		}
		void complexnumber()
		{
			System.out.println("Complex Number :"+real +" +"+imaginary+"i");
		}
	}

public class Ex26 
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the first two complex number");
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  
	  System.out.println("Enter the second  two complex number");
	  int c = sc.nextInt();
	  int d = sc.nextInt();
	  
	  complex c1 = new complex(a,b);
	  c1.complexnumber();
	  
	  complex c2 = new complex(c,d);
	  c2.complexnumber();
	  
	  complex c3 = new complex();
	  c3 = c3.addition(c1, c2);
	  
	  System.out.println("Subtraction of complex number.");
	  c3.complexnumber();
	
}
}

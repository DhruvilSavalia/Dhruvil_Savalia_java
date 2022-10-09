package Javaprograms;
import java.util.Scanner;
public class Subject_marks 
{
  public static void main(String[]args)
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter first subject mark1:");
	  int mark1 = sc.nextInt();
	  System.out.println("Enter the second subject mark2:");
	  int mark2 = sc.nextInt();
	  System.out.println("Enter the third subject mark3:");
	  int mark3 = sc.nextInt();
	  System.out.println("Enter the fourt subject mark4:");
	  int mark4 = sc.nextInt();
	  System.out.println("Enter the fifth subject mark5:");
	  int mark5 = sc.nextInt();
	  int m=mark1+mark2+mark3+mark4+mark5;
	  int a=500;
	  System.out.println("Total marks:");
	  System.out.println(m);
	  float p = (m*100)/a;
	  System.out.println("Percentage:");
	  System.out.println(p);
  }
  
}



package Javaprograms;
import java.util.Scanner;
public class Naturalnumbers 
{
  public static void main(String[]args) 
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number:");
	  int no = sc.nextInt();
	  
	  int a = (no*(no+1))/2;
	  
	  while(a<=10)
	  {
		  System.out.println("Natural numbers = "+a);
		  a++;
	  }
	
   }
  
}

import java.util.Scanner;

class HelloWorld 
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the year number:");
     int number = sc.nextInt();
     int year=number%4;

     if(year==0)
     {
         System.out.println("This is a leap year.");
     }
     else
     {
         System.out.println("This is not a leap year.");
     }
  }
}
        
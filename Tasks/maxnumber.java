import java.util.Scanner;
class Max_number
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the first number:");    
       int first = sc.nextInt();
       System.out.println("Enter the second number:");
       int second = sc.nextInt();
       System.out.println("Enter the third number:");
       int third = sc.nextInt();

       if(first>second && first>third)
       {
          System.out.println("Maximum number is :" +first);
       }
       if(second>third && second>first)
       {
          System.out.println("Maximum number is :" +second);
       }
       if(third>first && third>second)
       {
          System.out.println("Maximum number is :" +third); 
       }
    }
}
import java.util.Scanner;
class simple_calculator
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number1:");
       int number1 = sc.nextInt();
       System.out.println("Enter the number2:");
       int number2 = sc.nextInt();
       System.out.println("addition is:");
       System.out.println(number1+number2);
       System.out.println("substraction is:");
       System.out.println(number1-number2);
       System.out.println("multiplication is:"); 
       System.out.println(number1*number2);
       System.out.println("division is:");
       System.out.println(number1/number2);
   }
} 
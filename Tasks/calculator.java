import java.util.Scanner;
class Calculator
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the First number:");
      int First = sc.nextInt();
      System.out.println("Enter the Second number:");
      int Second = sc.nextInt();
      System.out.println("[1]addition.\n[2]substraction.\n[3]multiplication.[4]division.");
      System.out.println("Enter the number:");
      int number = sc.nextInt();
 
       switch(number)
       {
         case 1:
            System.out.println("addition is: "+(First+Second));
            break;
         case 2:
            System.out.println("substraction is: "+(First-Second));
            break;
         case 3:
            System.out.println("multiplication is : "+(First*Second));
            break;
         case 4:
            System.out.println("division is: "+(First/Second));
            break;
         default:
            System.out.println("Enter the valid choice:");
      }

    }
}
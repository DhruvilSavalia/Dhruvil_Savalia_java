import java.util.Scanner;
class Square_Cube
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number:");
      int number = sc.nextInt();
      System.out.println("Cube:");
      System.out.println(number*number*number);
      System.out.println("Square:");
      System.out.println(number*number);
   }
} 
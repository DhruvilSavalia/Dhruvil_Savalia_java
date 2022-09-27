import java.util.Scanner;

class Helloworld
{
  public static void main(String[] args)
  {
    Scanner a = new Scanner(System.in);

    System.out.println("Enter the radius:");
    int radius = a.nextInt();

    System.out.println("Area of circle:");
    System.out.println(3.14*radius*radius);
  }
} 
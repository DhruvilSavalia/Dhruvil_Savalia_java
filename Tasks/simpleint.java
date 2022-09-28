import java.util.Scanner;
class Simple_Interest
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int p,r,t,si;
       System.out.println("Enter the principle:");
       p = sc.nextInt();
       System.out.println("Enter the rate:");
       r = sc.nextInt();
       System.out.println("Enter the time:");
       t = sc.nextInt();
       System.out.println("Simple Interest is:");
       System.out.println(si=p*r*t/100);
    }
}
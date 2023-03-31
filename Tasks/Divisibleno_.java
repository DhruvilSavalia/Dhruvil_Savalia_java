
public class Divisibleno_ 
{
	public static void main(String[] args) 
	{
		System.out.println("Divide by 3");
		for(int i=0;i<100;i++)
		{
			if(i%3==0)
			{
				System.out.println(i +",");
			}
		}
		System.out.println("\nDivide by 5");
		for(int j=0;j<=100;j++)
		{
			if(j%5==0)
			{
				System.out.println(j+",");
			}
		}
		System.out.println("\nDivide by 3 & 5");
		for(int k=0;k<=100;k++)
		{
			if(k%3==0 && k%5==0)
			{
				System.out.println(k +",");
			}
		}
		
	}

}

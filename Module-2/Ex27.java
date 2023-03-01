package javaprograms;

abstract class parent
{
	public abstract void message();
}
class subclass1 extends parent
{

	@Override
	public void message() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is first Subclass");
		
	}
	
}
class subclass2 extends parent
{

	@Override
	public void message() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is second Subclass");
		
	}
	
}
public class Ex27 
{
	public static void main(String[] args) 
	{
		subclass1 s1 = new subclass1();
		s1.message();
		
		subclass2 s2 = new subclass2();
		s2.message();
		
	}

}

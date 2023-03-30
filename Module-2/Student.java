import javax.naming.NameNotFoundException;

import javaprograms.AgeNotWithInRangeException;

public class Student 
{
	int roll,age;
	String name,course;
	Student()
	{
		roll=0;
		name=null;
		age=0;
		course=null;
		
	}
	Student( int r, String n , int a, String c)
	{
		roll = r;
		course=c;
		int l,temp=0;
		l = n.length();
		for(int i=0;i<l;i++)
		{
			char ch;
			ch=n.charAt(i);
			if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
				  temp=1;
		}
		try
		{
			if(temp==1)
			{
				throw new NameNotFoundException();
				
			}
			else
			{
				name=n;
			}
		}
		catch(NameNotFoundException e2)
		{
			System.out.println(e2);
		}
		
		try
		{
			if(a>=15 && a<=21)
			{
				age=a;
			}
			else
			{
				throw new AgeNotWithInRangeException();
			}
			
			
		}
		catch(AgeNotWithInRangeException e1)
		{
			System.out.println(e1);
		}
		
	}
	void display()
	{
		System.out.println("Roll Name Age Course");
		System.out.println("-----------------------");
		System.out.println(roll+" "+name+" "+age+" "+course);
	}

}

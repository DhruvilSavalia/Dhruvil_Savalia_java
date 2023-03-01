package javaprograms;

abstract class marks
{
	public abstract float getpercentage();
	
}
class student_A extends marks
{
	float sub1,sub2,sub3;
	float percentage;
	
	student_A(float a, float b, float c)
	{
		sub1 = a;
		sub2 = b;
		sub3 = c;
	}
	
	@Override
	public float getpercentage() 
	{
		// TODO Auto-generated method stub
		percentage = (sub1+sub2+sub3)/300*100;
		return percentage;
	}
	
}
class student_B extends marks
{
  float sub1,sub2,sub3,sub4;
  float percentage;
  
  student_B(float a, float b, float c, float d)
  {
	  sub1 = a;
	  sub2 = b;
	  sub3 = c;
	  sub4 = d;
  }
	@Override
	public float getpercentage() 
	{
		// TODO Auto-generated method stub
		percentage = (sub1+sub2+sub3+sub4)/400*100;
		return percentage;
	}
	
}

public class Ex29 
{
	public static void main(String[] args) 
	{
		student_A a = new student_A(60,44,70);
		System.out.println("Student A percentage :"+a.getpercentage());
		
		student_B b = new student_B(68,64,93,40);
		System.out.println("Student B percentage :"+b.getpercentage());
		
	}

}

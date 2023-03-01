package javaprograms;

class triangle
{
	int a,b,c;
	
	void triangle_area(int a, int b, int c)
	{
		float s;
		double area;
		s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area of triangle is :"+area);
	}
	void perimeter(int a, int b, int c)
	{
		float p;
		p = a+b+c;
		System.out.println("Perimeter of triangle is :"+p);
	}
	
}

public class Ex25 
{
   public static void main(String[] args) 
   {
	   triangle t = new triangle();
	   t.triangle_area(3, 4, 5);
	   t.perimeter(3, 4, 5);
	
}	

}

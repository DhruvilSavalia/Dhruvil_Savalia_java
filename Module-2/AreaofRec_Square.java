package javaprograms;

public class AreaofRec_Square 
{
	void area_rectangle(int l , int w)
	{
		System.out.println("Area of rectangle : "+l*w);
	}
	void area_square(int a)
	{
		System.out.println("Area of square : "+a*a);
	}
	public static void main(String[] args) 
	{
		AreaofRec_Square a = new AreaofRec_Square();
		
		a.area_rectangle(12, 20);
		a.area_square(20);
		
	}
	

}

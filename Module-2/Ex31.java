package javaprograms;

abstract class shapes
{
	abstract void RectangleArea(double length , double breadth);
	
	abstract void CircleArea(double radius);
	
	abstract void SquareArea(double side);
}
class area extends shapes
{

	@Override
	void RectangleArea(double length, double breadth) 
	{
		// TODO Auto-generated method stub
	     double area = length*breadth;
	     System.out.println("Area of rectangle :"+area);
	}

	@Override
	void CircleArea(double radius) 
	{
		// TODO Auto-generated method stub
	    double area = (radius*radius)*3.14;
	    System.out.println("Area of circle :"+area);
	}

	@Override
	void SquareArea(double side) 
	{
		
		// TODO Auto-generated method stub
		double area = side*side;
		System.out.println("Area of square : "+area);
	}
	
}

public class Ex31 
{
  public static void main(String[] args) 
  {
	  area a = new area();
	  a.RectangleArea(40, 20);
	  a.CircleArea(30);
	  a.SquareArea(15);
	
  }	

}

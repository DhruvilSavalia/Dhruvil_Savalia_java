

class Shape
{
	public void Shape()
	{
		System.out.println("This is a Shape");
	}
}
class Rectangle extends Shape
{
	public void rectangle()
	{
		System.out.println("This is a rectangular shape");
	}
}
class Circle extends Shape
{
	public void circle()
	{
		System.out.println("This is a circular shape");
	}
}

class Square__ extends Rectangle
{
	public void square()
	{
		System.out.println("Square is a rectangle");
	}
}

public class Ex32 
{
	public static void main(String[] args) 
	{
		Square__ sq = new Square__();
		sq.Shape();
		sq.rectangle();
		
	}

}

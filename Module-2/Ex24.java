package javaprograms;

class rectangle
{
	int length ;
	int breadth;
	
	public rectangle(int l , int b)
	{
		length = l;
		breadth = b;
	}
	void rect_area()
	{
		System.out.println(length*breadth);
	}
	void perimeter()
	{
		System.out.println(2*(length+breadth));
	}
	
}
class Square extends rectangle
{
	public Square(int s)
	{
		super (s,s);
		
	}
}

public class Ex24 
{
	public static void main(String[] args) 
	{
		rectangle r = new rectangle(2,5);
		Square s = new Square(5);
		r.rect_area();
		r.perimeter();
		s.rect_area();
		s.perimeter();
		
	}
  
}

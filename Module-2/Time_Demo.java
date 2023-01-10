import java.util.Date;
import java.text.SimpleDateFormat;

public class Time_Demo 
{
	public static void main(String[] args) 
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new  Date();
		System.out.println(sdf.format(date));
		
		
	}

}

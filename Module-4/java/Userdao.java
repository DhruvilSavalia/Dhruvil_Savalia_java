import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Userdao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		return con;
	}
	public static int savedata(Model m)
	{
		int status = 0;
		
		Connection con = Userdao.getconnect();
		
		String sql = "insert into detail (name,password) values(?,?)";
		
		try
		{
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,m.getName());
			ps.setString(2,m.getPassword());
			
			status = ps.executeUpdate();
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
		
	}

}

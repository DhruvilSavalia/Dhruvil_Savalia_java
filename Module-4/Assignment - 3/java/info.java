import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyForm")
public class info extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String Fname = req.getParameter("fname");
		String Lname = req.getParameter("lname");
		String Email = req.getParameter("email");
		String Mobile = req.getParameter("mobile");
		String Gender = req.getParameter("gender");
		String Password = req.getParameter("password");
		
		resp.setContentType("text/html");
		
		System.out.println("Fname :"+Fname);
		System.out.println("Lname :"+Lname);
		System.out.println("Email :"+Email);
		System.out.println("Mobile :"+Mobile);
		System.out.println("Gender :"+Gender);
		System.out.println("Password :"+Password);
		
	}
	

}

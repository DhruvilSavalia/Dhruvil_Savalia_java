import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Saveservlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String fullname = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		Model m = new Model();
		m.setName(fullname);
		m.setPassword(pass);
		
		int data = Userdao.savedata(m);
		
		if(data>0)
		{
			out.print("Success");
		}
		else
		{
			out.print("Fail");
		}
		
		
	}
	

}

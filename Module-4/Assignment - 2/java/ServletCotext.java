import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCotext extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		PrintWriter ps = resp.getWriter();
		
		ServletContext context = getServletContext();
		
		String s1 = context.getInitParameter("n1");
		String s2 = context.getInitParameter("n2");
		
		ps.println("My name is " +s1+" I am " +s2);
		
		ps.close();
		
		
	}

}

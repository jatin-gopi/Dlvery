package info.delivery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;	

@SuppressWarnings("serial")
public class login extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    String n=request.getParameter("user");  
	    String p=request.getParameter("password");
	    if(update.match(n,p))
	    {
	    	RequestDispatcher rd=request.getRequestDispatcher("Home.html");  
	        rd.forward(request,response); 
	    }
	    else
	    {  
	        out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("Login.html");  
	        rd.include(request,response);  
	    } 
	    out.close();
	}
}
package info.delivery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;	

@SuppressWarnings("serial")
public class deleteregister extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    String id=request.getParameter("id"); 
	    if(dupdate.match(id))
	    {
	    	RequestDispatcher rd=request.getRequestDispatcher("DeleteRegister.html");  
	        rd.forward(request,response); 
	    }
	    else
	    {  
	        out.print("Sorry Error in Updating");  
	        RequestDispatcher rd=request.getRequestDispatcher("DeleteRegister.html");  
	        rd.include(request,response);  
	    } 
	    out.close();
	}
}